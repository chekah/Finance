package aminParsian.service.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by ach on 1/8/2019.
 */
public class ErsalBeBankJob extends QuartzJobBean {

    ErsalBeBankTask ersalBeBankTask;

    public ErsalBeBankTask getErsalBeBankTask() {
        return ersalBeBankTask;
    }

    public void setErsalBeBankTask(ErsalBeBankTask ersalBeBankTask) {
        this.ersalBeBankTask = ersalBeBankTask;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        ersalBeBankTask.ersalBeBank();
    }
}
