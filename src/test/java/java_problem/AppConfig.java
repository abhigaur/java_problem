package java_problem;

public class AppConfig {
	
	AppConfig ap= null;
	
	private AppConfig AppConfig()
	{
		if(ap==null)
		{
			ap=new AppConfig();
		}
		
		return ap;
	}
	
	

}
