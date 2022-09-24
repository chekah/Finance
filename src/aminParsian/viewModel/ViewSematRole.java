package aminParsian.viewModel;

import java.math.BigDecimal;

/**
 * Created by 8041 on 4/27/2016.
 */
public class ViewSematRole {

    private BigDecimal roleid;
    private String rolename;
    private Boolean isSelected;
    private BigDecimal sematid;
    private String sematname;
    private BigDecimal moduleId;
    private BigDecimal sidetabId;
    private BigDecimal actionId;
    private String module;
    private String sidetab;
    private String action;

    public ViewSematRole() {
    }

    public ViewSematRole(BigDecimal roleid, String rolename, Boolean isSelected, BigDecimal sematid, String sematname, BigDecimal moduleId, BigDecimal sidetabId, BigDecimal actionId, String module, String sidetab, String action) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.isSelected = isSelected;
        this.sematid = sematid;
        this.sematname = sematname;
        this.moduleId = moduleId;
        this.sidetabId = sidetabId;
        this.actionId = actionId;
        this.module = module;
        this.sidetab = sidetab;
        this.action = action;
    }

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public BigDecimal getSematid() {
        return sematid;
    }

    public void setSematid(BigDecimal sematid) {
        this.sematid = sematid;
    }

    public String getSematname() {
        return sematname;
    }

    public void setSematname(String sematname) {
        this.sematname = sematname;
    }

    public BigDecimal getModuleId() {
        return moduleId;
    }

    public void setModuleId(BigDecimal moduleId) {
        this.moduleId = moduleId;
    }

    public BigDecimal getSidetabId() {
        return sidetabId;
    }

    public void setSidetabId(BigDecimal sidetabId) {
        this.sidetabId = sidetabId;
    }

    public BigDecimal getActionId() {
        return actionId;
    }

    public void setActionId(BigDecimal actionId) {
        this.actionId = actionId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getSidetab() {
        return sidetab;
    }

    public void setSidetab(String sidetab) {
        this.sidetab = sidetab;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
