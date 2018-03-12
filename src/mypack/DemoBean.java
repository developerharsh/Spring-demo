package mypack;

public class DemoBean implements Demo 
{
	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void showData()
	{
		System.out.println("Welcome: "+userName);
	}
}
