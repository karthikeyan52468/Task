package Model;

public class User {

	private int id;
	private String name;
	private double pi=3.14;
	public User(){}
	
	private User(int id) {}
	
	 User(int id,String name) {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private void hidden(String greet)
	{
		System.out.println(greet);
	}
	
}
