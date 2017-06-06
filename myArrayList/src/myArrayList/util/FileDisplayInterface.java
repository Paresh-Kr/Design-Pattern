package myArrayList.util;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;


public interface FileDisplayInterface 
{

public static void writeToFile(String s)
{
	try{
		File file=new File("ouput.txt");
		if(!file.exists()){
	    	   file.createNewFile();
	    	}
		FileWriter FW= new FileWriter(file);
		BufferedWriter BW= new BufferedWriter(FW);
		BW.write(s);
		BW.close();
	}catch(IOException ie){
		System.out.println("Exception Happened in file File write");
		
	}
	
}
}
