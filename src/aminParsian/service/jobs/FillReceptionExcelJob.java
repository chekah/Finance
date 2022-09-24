package aminParsian.service.jobs;

import aminParsian.service.IACHService;
import aminParsian.viewModel.ViewReceptionExcel;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * Created by ach on 7/25/2020.
 */
public class FillReceptionExcelJob extends QuartzJobBean {

    private FillReceptionExcelTask fillReceptionExcelTask;

    public FillReceptionExcelTask getFillReceptionExcelTask() {
        return fillReceptionExcelTask;
    }

    public void setFillReceptionExcelTask(FillReceptionExcelTask fillReceptionExcelTask) {
        this.fillReceptionExcelTask = fillReceptionExcelTask;
    }




    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        fillReceptionExcelTask.fillReceptionExcel();

//        if (viewDBReceptionExcelList != null && viewDBReceptionExcelList.size() != 0) {
//            String result = fillReceptionExcelTask.saveCredebitForReceptionExcel(viewDBReceptionExcelList);
//        }
    }
}
