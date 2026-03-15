package project.JsonReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Read {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
	List<Model> m=	mapper.readValue(new File("D:\\Task\\JsonReadWrite\\src\\resources\\report.json"),

				new TypeReference<List<Model>>() {}
				);
	
	for(Model model : m)
	{
		System.out.println(model.getName());
	}
	}
}
