package myArrayList.driver;
import myArrayList.test.MyArrayListTest;
import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;
public class Driver 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		//MyArrayListTest mytest= new MyArrayListTest();
		MyArrayList mal= new MyArrayList();
		FileProcessor fp= new FileProcessor();
		Results rslt=new Results();
		MyArrayListTest.Sum_Test(mal, rslt, fp);
		
	}
	
}
