package myArrayList;
import java.util.Arrays;


public class MyArrayList{
	 
	 private static int  array_size;
	// private static int max_value;
	 private static int T_count; // updated total value in array
	 private int[] MyArray;
	 
	public MyArrayList(){
		array_size=50;
	//	max_value=75;
		T_count=0;
		MyArray=new int[array_size];
	}
	/**********  Method for  insertSorted **************/
	private void insertSorted(int newValue)
	{
		if(T_count == array_size)
		{
			resize(MyArray);
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
	private static void resize(int array[]){
		
		array_size=(int) (0.5 *array_size);
		int[] temp=  new int[array_size];
		for(int i=0;i<T_count-1;i++)
		{
			temp[i]=array[i];
		}
		array=temp;
	}
	
	private static void Sort(int array[]) { //bubble sort to sort the array
        int len = array.length;
        int temp = 0;  
        for(int i=0; i < len; i++){  
                for(int j=1; j < (len-1); j++){  
                         if(array[j-1] > array[j])
                         {   
                                temp = array[j-1];  
                                array[j-1] = array[j];  
                                array[j] = temp;  
                          }  
                }
        }
                         
    }
	private void removeValue(int value)
	{
		 
		for(int i=0;i<T_count-1;i++)
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
	private int indexOf(int value)
	{
		
		for(int i=0; i<T_count-1;i++)
		{
			if(MyArray[i]== value)
			{
				return i;
			}else 
			{
				return -1;
			}
		
		}
	 return -1;	
	}
	private int size() //size of array
	{
		return T_count;
	}
	private int sum()
	{
		int sum=0;
		for(int i=0;i<T_count;i++)
		{
			sum=sum+MyArray[i];
		}
		return sum;
	}
}