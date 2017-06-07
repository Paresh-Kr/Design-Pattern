package myArrayList.util;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileProcessor {

	private static BufferedReader br;

	public static String readLine(){ //return one line at a time
		
	    String str="";
		try{
	    File file =new File("input.txt");
	    if(!file.exists()){
	    	System.out.println("Please provide Input file");
	    	}
		
	    FileReader fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
        while((str=br.readLine()) !=null) 
        {
        	return str; // change for each line
        }
        

		}catch(IOException ie)
		{
			ie.printStackTrace();
		}
	    
		return null;
		
	}
}
