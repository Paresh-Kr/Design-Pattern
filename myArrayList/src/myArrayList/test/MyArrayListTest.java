package myArrayList.test;
import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;


public class MyArrayListTest {
	
	public static void Sum_Test(MyArrayList myArrayList, Results results, FileProcessor fileProcessor)
	{
		String str = "";
		while ((str = fileProcessor.readLine()) != null)
		{
			int sortvalue = 0;
			sortvalue = Integer.parseInt(str);
			myArrayList.insertSorted(sortvalue);
		}
		
		String result = "The sum of all the values in the array list is : " + myArrayList.sum();
		results.storeNewResult(result);
	}
	
  

}
