package project.beanIO;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

public class Reader {

	public static void main(String[] args) throws IllegalArgumentException, FileNotFoundException {
		
		StreamFactory f=StreamFactory.newInstance();
		f.load("D:\\Task\\beanIO\\src\\main\\resources\\beanio.xml");
		BeanReader reader = f.createReader("emp", new FileReader("D:\\Task\\beanIO\\src\\\\main\\resources\\report.csv"));
		Object record;
		while((record= reader.read())!=null)
		{
			Model e = (Model)record;
			System.out.println(e.getName());
		}
	}
}
