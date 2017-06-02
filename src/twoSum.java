import java.util.Arrays;
import java.util.HashSet;

public class twoSum {

		public static int[] findPair(int[] nums, int target){
		 
		 HashSet<Integer> hs = new HashSet<Integer>(); 
		 int[] res = new int[2];
		  
		 for(int i=0; i<nums.length;i++){
		  
		 if(!hs.contains(Math.abs(nums[i] - target))){
		 	hs.add(nums[i]);
		 }
		 else{
			res[0] = nums[i];
		    res[1] = Math.abs(nums[i] - target);
		 	return res;
		 }
		 }
		  
		 return res;
		  
		 }

		public static int[] findPairWithoutSpace(int[] nums, int target){
			Arrays.sort(nums);
			int low = 0;
			int high = nums.length-1;
			int[] res = null;
			for(int i=0;i<nums.length;i++){
			 
			int lookUP = Math.abs(nums[i]-target);	
				//Do binary search
				
			while(low<=high){
			
			 
			int mid = low + ((high-low)/2);
			
			 
			if(nums[mid]>lookUP){
			high = mid - 1;
			} 
			else if(nums[mid]<lookUP){
			low = mid + 1; 
			
			}
			else if(nums[mid] == lookUP){
				
			return new int[]{nums[i],lookUP};
			}
			 
			}
			 
			}
			return res;
			}

		
		
		public static void main(String args[]){
			
			int[] nums = {2,1,7,5,4};
			int target = 8;
			
			int[] result = findPairWithoutSpace(nums,target);
			
			for(int i=0; i<result.length;i++){
				System.out.println(result[i]);
			}
			
			
		}
	
	
	
}
