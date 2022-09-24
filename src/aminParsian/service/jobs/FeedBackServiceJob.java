package aminParsian.service.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import aminParsian.util.DateUtil;

public class FeedBackServiceJob extends QuartzJobBean {


    private FeedBackServiceTask feedBackServiceTask;

    public void setFeedBackServiceTask(FeedBackServiceTask feedBackServiceTask) {
        this.feedBackServiceTask = feedBackServiceTask;
    }

    public FeedBackServiceJob() {
        this.feedBackServiceTask = new FeedBackServiceTask();
    }


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println(DateUtil.getCurrentTime());
        feedBackServiceTask.getFeedBackACH();
    }
}
