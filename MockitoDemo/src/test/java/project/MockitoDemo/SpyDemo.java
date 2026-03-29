package project.MockitoDemo;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyDemo {

	@Test
	public void test_list()
	{
		ArrayList<String> al = spy(new ArrayList<String>());

		al.add("hello");
		
		verify(al,times(1)).add("hello");
	
		doReturn(100).when(al).size();
		System.out.println(al.size());
	}
}
