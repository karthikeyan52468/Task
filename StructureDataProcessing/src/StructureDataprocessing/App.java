package StructureDataprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
	static BufferedWriter writer=null;
	static BufferedReader reader =null;
	public static void main(String[] args) throws IOException {
		
		 writer = new BufferedWriter(new FileWriter("output.csv"));
		 reader = new BufferedReader(new FileReader("input.csv"));
		ArrayList<Model> chunk = new ArrayList<Model>();
		
		String line;
		while((line=reader.readLine())!=null)
		{
			String[] data = line.split(",");
 			Model model = new Model(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]));
			chunk.add(model);
			if(chunk.size()==10)
			{
				process(chunk);
				chunk.clear();
			}
		
			
		}
		if(!(chunk.size()==0))
		{
			process(chunk);
			chunk.clear();
		}
		reader.close();
		writer.close();
		
	}
	static void process(List<Model> chunk)
	{
		for(int i=0;i<chunk.size();i++)
		{
			try {
				writer.write(chunk.get(i).getId()+","+chunk.get(i).getName().toUpperCase()+","+chunk.get(i).getSalary());
				writer.newLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
	}

}
