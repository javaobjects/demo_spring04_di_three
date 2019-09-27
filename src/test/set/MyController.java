package test.set;

public class MyController {
	
	
	private MyService service;
	
	
	
	public MyService getService() {
		return service;
	}



	public void setService(MyService service) {
		System.out.println("setService()");
		this.service = service;
	}



	public void login()
	{
		System.out.println("MyController login......");
		service.serviceLogin();
	}

}
