package project.QuartzSchedulingTest;

import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Main implements Job{

	public static void main(String[] args) throws SchedulerException {
		
		JobDetail jobDetails = JobBuilder.newJob(Main.class).withIdentity("job1", "group1").build();
		
//		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("t1","group1")
//				.startNow()
//				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
//				.build();
		
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("t1","group1")
				.withSchedule(CronScheduleBuilder.cronSchedule("0 0 8,13,20 * * ?"))
				.build();
		
		Scheduler s =StdSchedulerFactory.getDefaultScheduler();
		s.scheduleJob(jobDetails, trigger);
		s.start();
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		Task1 t1= Task1.getInstance();
		Task2 t2 = Task2.getInstance();
		t1.execute();
		t2.execute();
				
		
	}

}
