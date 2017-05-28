import java.util.Arrays;
import java.util.Hashtable;

public class StringPermutation {

	
	static boolean  permutation(String s, String t) {
		 if (s.length() != t.length()) {
			 return false ;
		 }
		
		 int[] letters = new int[128]; 
		char[] s_array = s.toCharArray();
		 for (char c : s_array) { 
		 letters[c]++;
		 }
		
		 for (int i = 0; i < t.length(); i++) {
		 int c = (int) t.charAt(i);
		 letters[c] --;
		 if (letters[c] < 0) {
		 return false;
		 }
		 }	
		 return true;
		 
		 }
	
	
	public static boolean checkIfItIsPermutation(String A, String B){
		 
		if(A == null||B==null)
			return false; 
		if(A.length() != B.length())
			return false; 
		char[] aCharacterArray = A.toCharArray(); 
		char[] bCharacterArray = B.toCharArray(); 
		
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
	int count = 1;	
	 
	 
		for(int i=0;i<aCharacterArray.length;i++){
		if(!ht.containsKey(aCharacterArray[i]))
			ht.put(aCharacterArray[i], count);
		else
			ht.put(aCharacterArray[i],ht.get(aCharacterArray[i])+1);
		}
	 
		for(int j=0;j<bCharacterArray.length;j++){
		
		if(!ht.containsKey(bCharacterArray[j]))
				return false;
		
		int finalValue = ht.get(bCharacterArray[j]);
	            ht.put(bCharacterArray[j], finalValue--);
		
		if(ht.get(bCharacterArray[j])<0)
	               return false;
		
	 
		}
			return true;
		}

	
	//Most elegant method is using sort 
	
	public static String sortString(String A){
		char[] sortArray = A.toCharArray();
		Arrays.sort(sortArray);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<sortArray.length;i++){
			sb.append(sortArray[i]);
		}
		return sb.toString();
		
	}
	
	public static boolean checkPermutationUsingSort(String A, String B){
		System.out.println(sortString(A));
		return sortString(A).equals(sortString(B));
	}
	
	
	
	public static void main(String args[]){
		
		if(checkIfItIsPermutation("ddaaabbc    ", "addaacbb"))
				System.out.println("both are permutations");
		
		else
				System.out.println("both are not");
		
		
		if(checkPermutationUsingSort("fog      ", "gof"))
				System.out.println("they are permuted");
		else
			System.out.println("they are not");
		
	}
	
	
}
