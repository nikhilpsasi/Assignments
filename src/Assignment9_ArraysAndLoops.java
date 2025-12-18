/*
Given values are 12 ,34,11,36,87,98,93.
Store the values in Array and Print second and third largest number from the above values without
using collections and default sort methods
 */
public class Assignment9_ArraysAndLoops 
{

	public static void main(String[] args) 
	{
		int First=0;
		int Second=0;
		int Thired=0;
		int [] Arr = new int[7];
		
		Arr[0]=12;
		Arr[1]=34;
		Arr[2]=11;
		Arr[3]=36;
		Arr[4]=87;
		Arr[5]=98;
		Arr[6]=93;
		
		for(int i=1;i<Arr.length;i++)
		{
			
			 if (Arr[i] > First) {
	                Thired = Second;
	                Second = First;
	                First = Arr[i];
	            }
	            else if (Arr[i] > Second && Arr[i] != First) {
	                Thired = Second;
	                Second = Arr[i];
	            }
	            else if (Arr[i] > Thired && Arr[i] != First && Arr[i] != Second) {
	                Thired = Arr[i];
	            }
			
		}
		System.out.println("Second Largest Number: " + Second);
        System.out.println("Third Largest Number: " + Thired);
		}	

}
