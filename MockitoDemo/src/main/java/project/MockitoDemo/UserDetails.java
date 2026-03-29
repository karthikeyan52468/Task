package project.MockitoDemo;

public class UserDetails {

	private UserRepo userRepo;
	
	UserDetails(UserRepo userRepo)
	{
		this.userRepo=userRepo;
	}
	
	public String ServicefindNameById(int id)
	{
		return userRepo.findNameById(id);
	}
	
}
