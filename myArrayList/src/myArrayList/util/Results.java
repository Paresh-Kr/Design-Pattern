package myArrayList.util;
import myArrayList.util.FileDisplayInterface;
import myArrayList.util.StdoutDisplayInterface;

public class Results implements FileDisplayInterface ,StdoutDisplayInterface {
	
	public void storeNewResult(String s){
		//do stdout display
		Results rslt= new Results();
		StdoutDisplayInterface.writeToStdout(s);
		
		//do write to file 
		FileDisplayInterface.writeToFile(s);
	}

}
