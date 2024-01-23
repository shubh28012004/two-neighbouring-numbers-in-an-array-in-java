// user input 
import java.util.*;
public class UserInput{
	public int[] inputNumbers(int size){
		Scanner sc=new Scanner(System.in);
		
		int[] inputarray = new int[size];
		int i ;
		for(i=0;i<size;i++){

			System.out.println("Enter number "+(i+1) + ":");
			inputarray[i] = sc.nextInt();
		
				
		}
		return inputarray ; 
	}


}