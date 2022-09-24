package aminParsian.displaytag;

import com.lowagie.text.BadElementException;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.record.formula.functions.Cell;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.displaytag.export.BinaryExportView;
import org.displaytag.export.excel.ExcelHssfView;
import org.displaytag.model.Column;
import org.displaytag.model.ColumnIterator;
import org.displaytag.model.HeaderCell;
import org.displaytag.model.RowIterator;

import javax.servlet.jsp.JspException;
//import javax.swing.table.TableModel;
import org.displaytag.model.TableModel;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class MyExportViewClass extends ExcelHssfView  {

     //previous

    protected String escapeColumnValue(Object value) {

            String returnValue = null;
            if(value instanceof String) {
                String strValue = (String)value;

                if(strValue.trim().contains("&nbsp;")) {
                    returnValue = strValue.replace("&nbsp;"," ");
                }
                else {
                    returnValue = super.escapeColumnValue(value);
                }
            } else {
                returnValue = super.escapeColumnValue(value);
            }
            return returnValue;
    }


    private TableModel model;
    private boolean exportFull;
    private boolean header;
    private boolean decorated;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private int rowCount=0;
    private CellStyle normalstyle=null;
    private CellStyle headerstyle=null;
    private CellStyle captionstyle=null;

    private XSSFFont defaultFont;
    private XSSFFont headerFont;
    private XSSFFont captionFont;


    public String getMimeType() {
        return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    }

    public void setParameters(TableModel tableModel, boolean exportFullList, boolean includeHeader,
                              boolean decorateValues) {
        this.model = tableModel;
        this.exportFull = true;
        this.header = includeHeader;
        this.decorated = decorateValues;

    }

    public boolean outputPage() {
        return false;
    }

    protected void initTable() throws BadElementException {
        //Blank workbook
        workbook = new XSSFWorkbook();

        //Create a blank sheet
        sheet = workbook.createSheet("Server Management System");
        sheet.setRightToLeft(true);

        defaultFont= workbook.createFont();
        defaultFont.setFontHeightInPoints((short)10);
        defaultFont.setFontName("Tahoma");
        defaultFont.setColor(IndexedColors.BLACK.getIndex());
        defaultFont.setBold(false);
        defaultFont.setItalic(false);

        headerFont= workbook.createFont();
        headerFont.setFontHeightInPoints((short)10);
        headerFont.setFontName("Tahoma");
        headerFont.setColor(IndexedColors.WHITE.getIndex());
        headerFont.setBold(true);
        headerFont.setItalic(false);

        captionFont= workbook.createFont();
        captionFont.setFontHeightInPoints((short)15);
        captionFont.setFontName("Tahoma");
        captionFont.setColor(IndexedColors.BLACK.getIndex());
        captionFont.setBold(true);
        captionFont.setItalic(false);


        normalstyle= workbook.createCellStyle();
        normalstyle.setFillBackgroundColor(IndexedColors.WHITE.getIndex());
        normalstyle.setFillPattern(CellStyle.BIG_SPOTS);
        normalstyle.setAlignment(CellStyle.ALIGN_CENTER);
        normalstyle.setFont(defaultFont);


        headerstyle= workbook.createCellStyle();
        headerstyle.setFillBackgroundColor(IndexedColors.BLUE_GREY.getIndex());
        headerstyle.setFillPattern(CellStyle.BIG_SPOTS);
        headerstyle.setAlignment(CellStyle.ALIGN_CENTER);
        headerstyle.setFont(headerFont);


        captionstyle= workbook.createCellStyle();
        captionstyle.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        captionstyle.setFillPattern(CellStyle.BIG_SPOTS);
        captionstyle.setAlignment(CellStyle.ALIGN_CENTER);
        captionstyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        captionstyle.setFont(captionFont);

    }

    protected void generateXLSXTable() throws JspException, BadElementException
    {
        //adding caption
        if(this.model.getCaption()!=null && this.model.getCaption()!="")
        {
            XSSFRow blankrow = sheet.createRow(rowCount++);
            XSSFRow row = sheet.createRow(rowCount++);


            row.setHeight((short)5000);
            int columnCount=0;
            XSSFCell captionCell = row.createCell(columnCount++);
            captionCell.setCellValue(this.model.getCaption());
            captionCell.setCellStyle(captionstyle);
            sheet.addMergedRegion(new CellRangeAddress(
                    rowCount-1, //first row (0-based)
                    rowCount-1, //last row  (0-based)
                    columnCount-1, //first column (0-based)
                    columnCount+5  //last column  (0-based)
            ));
            XSSFRow blankrow2 = sheet.createRow(rowCount++);
        }

        if (this.header)
        {
            generateHeaders();
        }

        generateRows();

        //adding footer
        if(this.model.getFooter()!=null && this.model.getFooter()!="")
        {
            XSSFRow blankrow = sheet.createRow(rowCount++);
            XSSFRow blankrow2 = sheet.createRow(rowCount++);
            XSSFRow row = sheet.createRow(rowCount++);

            row.setHeight((short)1000);
            int columnCount=0;
            XSSFCell captionCell = row.createCell(columnCount++);
            captionCell.setCellValue(this.model.getFooter());
            captionCell.setCellStyle(captionstyle);
            sheet.addMergedRegion(new CellRangeAddress(
                    rowCount-1, //first row (0-based)
                    rowCount-1, //last row  (0-based)
                    columnCount-1, //first column (0-based)
                    columnCount+5  //last column  (0-based)
            ));
        }
    }

    protected void generateHeaders() throws BadElementException
    {
        Iterator<HeaderCell> iterator = this.model.getHeaderCellList().iterator();
        XSSFRow row = sheet.createRow(rowCount++);


        int columnCount=0;
        while (iterator.hasNext())
        {
//            sheet.autoSizeColumn(columnCount);


            if(columnCount ==0)
                sheet.setColumnWidth(columnCount,1000);
            else
               sheet.setColumnWidth(columnCount,5500);

            HeaderCell headerCell = iterator.next();

            String columnHeader = headerCell.getTitle();

            if (columnHeader == null)
            {
                columnHeader = StringUtils.capitalize(headerCell.getBeanPropertyName());
            }

            XSSFCell hdrCell = row.createCell(columnCount++);
            hdrCell.setCellValue(columnHeader);
            hdrCell.setCellStyle(headerstyle);
        }
    }

    protected void generateRows() throws JspException, BadElementException
    {
        // get the correct iterator (full or partial list according to the exportFull field)
        RowIterator rowIterator = this.model.getRowIterator(this.exportFull);
        // iterator on rows
        while (rowIterator.hasNext())
        {
            XSSFRow newrow = sheet.createRow(rowCount++);
            org.displaytag.model.Row row = rowIterator.next();
            // iterator on columns
            ColumnIterator columnIterator = row.getColumnIterator(this.model.getHeaderCellList());
            int columnCount=0;
            while (columnIterator.hasNext())
            {
                Column column = columnIterator.nextColumn();

                // Get the value to be displayed for the column
                Object value = column.getValue(this.decorated);

                XSSFCell Cell = newrow.createCell(columnCount++);
                Cell.setCellValue(ObjectUtils.toString(value));
            }
        }

    }

    @Override
    public void doExport(OutputStream out) throws  JspException {

        try {
            // Initialize the table with the appropriate number of columns
            initTable();

            generateXLSXTable();

        } catch (BadElementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
              try{
                 workbook.write(out);
                 out.close();

              } catch(IOException e)
              {

              }

                  }

}