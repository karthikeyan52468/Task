package project.MockitoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CaptureTest {

	@InjectMocks
	UserDetails ud;
	
	@Mock
	UserRepo repo;
	
	@Captor
	ArgumentCaptor<Integer> ac;
	
	@Test
	public void testServiceFindNameById()
	{
		ud.ServicefindNameById(55);
		
		verify(repo).findNameById(ac.capture());
		
		assertEquals(55, ac.getValue());
	}
}
