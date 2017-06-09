package myArrayList.test;
import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;


public class MyArrayListTest {
	
	public static void FileSUM(MyArrayList myArrayList, Results results, FileProcessor fileProcessor)
	{
		String str = "";
		int sortvalue = 0;
		int Expectedvalue=0;
		while ((str = fileProcessor.readLine()) != null)
		{ 
			sortvalue = Integer.parseInt(str);
			Expectedvalue=Expectedvalue+sortvalue;
			try{
			if(sortvalue >=0 &&  sortvalue<10000)
			{
			    myArrayList.insertSorted(sortvalue);
			}else
			{
				System.out.println("Value in input file Out of Range");
				System.exit(1);
			}
			}catch (NumberFormatException e) {

				results.storeNewResult(" got wrong type value  " + sortvalue);

			    }
		}
		if(Expectedvalue== myArrayList.sum())
		{
			results.storeNewResult("The sum of all the values in the array list is--"+myArrayList.sum());
		}
		String Output = "Test Case :-FileSUM - Passed " + "Expected Sum- "+Expectedvalue +" Actual Sum-"+ myArrayList.sum();
		results.storeNewResult(Output);
		}
	
	public static void testme(MyArrayList myArrayList, Results results,FileProcessor fileProcessor)
	{
		myArrayList.clear();
		FileSUM(myArrayList, results,fileProcessor)	;
		myArrayList.clear();
		initialized(myArrayList, results);
		Insertion(myArrayList, results);
		Indexing(myArrayList, results);
		findsum(myArrayList, results);
		testremoveValue(myArrayList, results);
		removeValuemany(myArrayList,results);
		sizetest(myArrayList, results);
		IsSorted(myArrayList,results);
		removevalue_emptylist(myArrayList,results);
		
		
	}

	private static void removevalue_emptylist(MyArrayList myArrayList, Results results) {

		int expected_value =myArrayList.size() ;
        int actual_value;
        myArrayList.removeValue(500);
        actual_value = myArrayList.size();
        if(expected_value ==actual_value)
            results.storeNewResult("Test Case :-removevalue_emptylist" + "-Passed");
        else
            results.storeNewResult("Test Case :-removevalue_emptylist" +"-Failed");
	}

	private static void removeValuemany(MyArrayList myArrayList, Results results) {

		for(int i = 0; i < 100; ++i) 
		{

			myArrayList.insertSorted(i);
        }
		myArrayList.removeValue(49);
		myArrayList.removeValue(50);
		myArrayList.removeValue(89);
		
		  if(myArrayList.size() != 97)
		  {
			  String Output = "Test Case :-removeValuemany - Failed " + "Expected size- "+99 +" Actual size-"+ myArrayList.size();
			  results.storeNewResult(Output);  
		  }
			  
			myArrayList.clear();

	}

	private static void IsSorted(MyArrayList myArrayList, Results results) {
        boolean flag=true;
		myArrayList.insertSorted(0);
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(13);
		myArrayList.insertSorted(67);
		myArrayList.insertSorted(80);
		myArrayList.insertSorted(23);
		
		for(int i=0;i<myArrayList.size();i++)
		{
			flag=false; 
			
		}
		myArrayList.clear();

	}

	private static void sizetest(MyArrayList myArrayList, Results results) {
		int size=0;
		for(int i = 0; i < 100; ++i) 
		{

			myArrayList.insertSorted(i);
			size++;
        }
		 if (myArrayList.size() != size) {
		    	
			    String Output = "Test Case :-sizetest - Failed " + "Expected Size- "+size +" Actual Size-"+ myArrayList.size();
				results.storeNewResult(Output);


		    }
			myArrayList.clear();

	}

	private static void testremoveValue(MyArrayList myArrayList, Results results) {
       

		for(int i = 0; i < 100; ++i) 
		{

			myArrayList.insertSorted(i);
        }
		myArrayList.removeValue(49);
		
		  if(myArrayList.size() != 99)
		  {
			  String Output = "Test Case :-testremoveValue - Failed " + "Expected size- "+99 +" Actual Sum-"+ myArrayList.size();
			  results.storeNewResult(Output);  
		  }
			  
			myArrayList.clear();

		
		
	}

	private static void findsum(MyArrayList myArrayList, Results results) {
		int Sum=0;
		for(int i = 0; i < 100; ++i) 
		{

			myArrayList.insertSorted(i);
			Sum=Sum+i;
          }
		
		if(myArrayList.sum() != Sum) 
	      {
	            	 String Output = "Test Case :-initialized - Failed " + "Expected Sum- "+Sum +" Actual Sum-"+ myArrayList.sum();
					results.storeNewResult(Output);

			}
		myArrayList.clear();

		
	}

	private static void Indexing(MyArrayList myArrayList, Results results) {
		
		for(int i = 0; i < 100; ++i) 
		{

			myArrayList.insertSorted(i);
        }
		
		for(int i = 0; i< 10;i++) 
		{
			
           if (myArrayList.indexOf(i) != i)
             {

			 String Output = "Test Case :-Indexing - Failed " + "expected indexOf(" + i + ") = " + i + ", got " + myArrayList.indexOf(i);
			 results.storeNewResult(Output);
             }
		}
		
		myArrayList.clear();

	}

	private static void Insertion(MyArrayList myArrayList, Results results) {
        
		int array_count = 0;
        for(int i = 0; i < 100; ++i) 
        {
          myArrayList.insertSorted(i);
          array_count++;
         
        }

		    if (myArrayList.size() == array_count) {
		    	
			    String Output = "Test Case :-Insert - Passed " + "Expected Size- "+array_count +" Actual Size-"+ myArrayList.size();
				results.storeNewResult(Output);


		    }
		    
			myArrayList.clear();


		}
	

	private static void initialized(MyArrayList myArrayList, Results results) {
		
		int size=0;
		int SUM=0;
		if(myArrayList.size() != 0)
		{
            String Output = "Test Case :-initialized - Failed " + "Expected Size- "+size +" Actual Sum-"+ myArrayList.size();
			results.storeNewResult(Output);
		}

      if(myArrayList.sum() != 0) 
      {
            	 String Output = "Test Case :-initialized - Failed " + "Expected Sum- "+SUM +" Actual Sum-"+ myArrayList.sum();
				results.storeNewResult(Output);

		}
  	myArrayList.clear();

	}
	

}
