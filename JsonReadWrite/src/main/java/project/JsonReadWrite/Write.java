package project.JsonReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class Write 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Model m1 = new Model();
        m1.setId(101);
        m1.setName("abc");
        m1.setEmail("abc@gmail.com");
        
        Model m2= new Model();
        m2.setId(102);
        m2.setName("xyz");
        m2.setEmail("xyz@gmail.com");
        
        ArrayList<Model> list = new ArrayList<Model>();
        list.add(m1);
        list.add(m2);
        
        mapper.writeValue(new File("D:\\Task\\JsonReadWrite\\src\\resources\\report.json"), list);
        System.out.println("file created");
      
    }
}
