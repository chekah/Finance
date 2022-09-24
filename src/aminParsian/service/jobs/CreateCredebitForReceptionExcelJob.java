package aminParsian.service.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.transaction.UnexpectedRollbackException;

/**
 * Created by ach on 8/1/2020.
 */
public class CreateCredebitForReceptionExcelJob extends QuartzJobBean {

    private CreateCredebitForReceptionExcelTask createCredebitForReceptionExcelTask;

    public CreateCredebitForReceptionExcelTask getCreateCredebitForReceptionExcelTask() {
        return createCredebitForReceptionExcelTask;
    }

    public void setCreateCredebitForReceptionExcelTask(CreateCredebitForReceptionExcelTask createCredebitForReceptionExcelTask) {
        this.createCredebitForReceptionExcelTask = createCredebitForReceptionExcelTask;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            createCredebitForReceptionExcelTask.saveCredebitForReceptionExcel();
        }catch (RuntimeException e){

        }

    }
}
