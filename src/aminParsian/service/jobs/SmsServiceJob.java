package aminParsian.service.jobs;

/**
 * Created by ach on 10/10/2018.
 */

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import aminParsian.util.DateUtil;

public class SmsServiceJob extends QuartzJobBean{

    private SmsServiceTask smsServiceTask;

    public SmsServiceTask getSmsServiceTask() {
        return smsServiceTask;
    }

    public void setSmsServiceTask(SmsServiceTask smsServiceTask) {
        this.smsServiceTask = smsServiceTask;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println(DateUtil.getCurrentTime());
        smsServiceTask.sendSms();
    }
}
