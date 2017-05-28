import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class UniqueString {
	
	public static boolean findUniqueInPlace(String data){
		 
			   if(data==null)
	                 return false;
	           if(data.length()>26)
		              return true; 
	           char[] charArray = data.toCharArray();
	           Arrays.sort(charArray);
	           
	            for(int i=0,j=1; j<charArray.length;i++){
	               if (charArray[i] == charArray[j])
	            	   return true;
	               
	               j++;
	            }
	            return false;
	}
	
	public boolean findUniqueString(String data){
		 
        if (data == null)
        		return false;
        if (data.length()>26)
        		return true;
        char[] dataArray = data.toCharArray(); 
        HashSet<Character> hs = new HashSet<Character>();

        for(int i=0;i<dataArray.length;i++){
        	if(!hs.contains(dataArray[i]))
        		hs.add(dataArray[i]);
        	else
        		return true;    
             }

           return false;

		}
	
	public static void main(String args[]){
		
		if(findUniqueInPlace("ABCDEFGHIJKLMNOPQR"))
			System.out.println("duplicate present");
		else
			System.out.println("It is unique dude");
		
	}


}
