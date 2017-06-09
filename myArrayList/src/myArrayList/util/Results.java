package myArrayList.util;
import myArrayList.util.FileDisplayInterface;
import myArrayList.util.StdoutDisplayInterface;

public class Results implements FileDisplayInterface ,StdoutDisplayInterface {
	
	
	public void writeToScreen(String s)
	{
       System.out.println("From :: -Write to Screen  :----"+ s.toString());
	}
	
	public void storeNewResult(String s){
		//do stdout display

		StdoutDisplayInterface.writeToStdout(s);

		//do write to file 
		FileDisplayInterface.writeToFile(s);
	}
	

}
