package project.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserDetailsTest {

	@Mock
	UserRepo userRepo;
	


	@Test
	public void testFindNamebyId()
	{
		String name=null;
		when(userRepo.findNameById(1)).thenReturn("karthi");
		
	    name=userRepo.findNameById(1);
	 
		assertNotNull(name);
		

	}
	
	

	@Test
	public void testServiceFindNameById()
	
	{
		
	}
	
	
	
	
}
