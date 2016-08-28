package nl.programIt;


import nl.programIt.service.interfaces.IWerknemerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {
  static ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static IWerknemerService getWerknemerService(){
		 return (IWerknemerService)context.getBean(IWerknemerService.class);
	}
}

