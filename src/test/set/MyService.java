package test.set;

public class MyService {
	
	private MyDao dao;
	
	
	
	
	public MyDao getDao() {
		return dao;
	}




	public void setDao(MyDao dao) {
		System.out.println("setDao()....");
		this.dao = dao;
	}




	public void serviceLogin()
	{
		System.out.println("MyService serviceLogin().....");
		dao.queryUserByNameAndPwd();
	}

}
