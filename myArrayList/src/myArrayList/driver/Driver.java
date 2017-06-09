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
		FileProcessor fp = null;
		if(args.length <1)
		{
			System.out.println("Please provide Input file");
			System.exit(1);
		}else if(args.length >2)
		{
			System.out.println("Entered More than two file");
			System.exit(1);
		}else if(args.length ==1 || args.length==2)
		{
			 fp= new FileProcessor(args[0],args[1]);

		}
		//MyArrayListTest mytest= new MyArrayListTest();
		MyArrayList mal= new MyArrayList();
		Results rslt=new Results();
		MyArrayListTest.testme(mal, rslt,fp);
		
	}
	
}
