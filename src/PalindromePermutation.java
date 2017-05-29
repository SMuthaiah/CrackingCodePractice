import java.util.HashSet;

public class PalindromePermutation {
	
	
	 public static boolean checkIfItIsPermutationOfPalindrome(String A){
		 
			if(A == null)
				return false;
		   HashSet<Character> hs = new HashSet<Character>();
		   char[] charArray = A.toCharArray();
		   for(Character c: charArray){
			   
			   if(c != ' '){
				if(!hs.contains(c))
					hs.add(c);
				else
					hs.remove(c);
			   }
		}
		   
		if(hs.size() == 1)
				return true;
		else
		        return false;
		 
		}  
		 

	 public static void main(String args[]){
		 
		 if(checkIfItIsPermutationOfPalindrome("malay alam"))
		 		System.out.println("yes It is !!");
		 
		 else
		 		System.out.println("nope, It is not!! ");
		 
		 
	 }

}
