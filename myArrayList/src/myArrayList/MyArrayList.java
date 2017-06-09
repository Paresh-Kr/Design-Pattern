package myArrayList;
import java.util.Arrays;


public class MyArrayList{
	 
	 private static int  array_size;
	// private static int max_value;
	 private static int T_count; // updated total value in array
	 private static int[] MyArray;
	 
	public MyArrayList(){
		array_size=50;
	//	max_value=75;
		T_count=0;
		MyArray=new int[array_size];
	}
	/**********  Method for  insertSorted **************/
	public void insertSorted(int newValue)
	{
		if(T_count == array_size)
		{
			resize();
			MyArray[T_count]=newValue;
			T_count++;
		}else
		{
			MyArray[T_count]=newValue;
			T_count++;
		}
		//call for sort 
	    Sort(MyArray);
		
	}
	private static void resize(){
		
		array_size= array_size +(int) (0.5 *array_size);
		
		int[] arr=  new int[array_size];
		for(int i=0;i<T_count;i++)
		{
			arr[i]=MyArray[i];
		}
		MyArray=arr;
	}
	
	private static void Sort(int array[]) { // sorting the array
		
        int len = T_count;
        int temp = 0;  
        for(int i=0; i < len; i++){  
                for(int j=0; j < (len-i-1); j++){  
                         if(array[j] > array[j+1])
                         {   
                                temp = array[j];  
                                array[j] = array[j+1];  
                                array[j+1] = temp;  
                          }  
                }
        }
                         
    }
	public void removeValue(int value)
	{
		 
		for(int i=0;i< T_count-1;i++)
		{
			if(MyArray[i]== value)
			{
				// remove and resize
				for(int j=i;j<T_count-1;j++)
				{
					MyArray[j]=MyArray[j+1];
				}
				T_count--;

			}
			
		}
		
		
	}
	public int indexOf(int value)
	{
		
		for(int i=0; i<T_count-1;i++)
		{
			if(MyArray[i] == value)
			{
                return i;
			}
		
		}
	 return -1;	
	}
	public int size() //size of array
	{
		return T_count;
	}
	public int sum()
	{
		int sum=0;
		for(int i=0;i<T_count;i++)
		{
			sum= sum+ MyArray[i];
		}
		return sum;
	}
	public void clear() 
	{
		java.util.Arrays.fill(MyArray,0);
	    for (int i = 0; i < T_count; i++)
	    {
	    	MyArray[i] = 0;
	    }
	    T_count = 0;		
	    }
}