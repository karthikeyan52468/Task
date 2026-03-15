package project.beanIO;

import java.io.FileWriter;
import java.io.IOException;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

/**
 * Hello world!
 *
 */
public class Write
{
    public static void main( String[] args ) throws IllegalArgumentException, IOException
    {
   
    	StreamFactory f = StreamFactory.newInstance();
    	f.load("D:\\Task\\beanIO\\src\\main\\resources\\beanio.xml");
    	
    	BeanWriter writer = f.createWriter("emp", new FileWriter("D:\\Task\\beanIO\\src\\main\\resources\\report.csv"));
    
    	Model m1= new Model();
    	m1.setId(101);
    	m1.setName("abc");
    	m1.setEmail("abc@gmail.com");
    	writer.write(m1);
    	
    	Model m2= new Model();
    	m2.setId(102);
    	m2.setEmail("xyz@gmail.com");
    	m2.setName("xyz");
    	writer.write(m2);
    	writer.flush();
    	writer.close();
    	System.out.println("file created");
    	
    }
}
