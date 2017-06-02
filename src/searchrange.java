
public class searchrange {

	    public static int[] searchRange(int[] nums, int target) {
	        
	        int mid = nums.length/2; 
	        int middle = 0;
	        int low = 0;
	        int high = nums.length-1; 
	        int [] res = new int[2];
	        int max = 0;
	        int min = 0;
	        
	        while(low<=high){
	            
	            middle = low + ((high-low)/2);
	            if(nums[middle]>target)
	            {
	                high = middle - 1; 
	            }
	            else if(nums[middle]<target)
	            {
	                low = middle + 1;
	            }
	            else if (nums[middle] == target)
	            {
	             if(nums[middle+1] == target){
	                for(int i=middle+1;i<nums.length;i++){
	                if(nums[i] == target){
	                 max = Math.max(max,i);
	                }
	                
	                }
	             }
	            
	                else if (nums[middle-1]== target){
	                for(int i=middle-1;i<0;i--){
	                    if(nums[i] == target){
	                        min = Math.min(min,i);
	                    }
	                }
	                
	            }
	            else{
	                
	                max = middle;
	                min = middle;
	                
	                
	            }
	        
	            }
	            
	            else{
	            	return res	;
	            }
	            
	            
	        }
	        
	        res[0] = min;
	        res [1] = max;
	        return res;
	    }
	    
	    
	    public static int[] searchR(int[] nums, int target) {
	        int[] result = new int[2];
	        result[0] = findFirst(nums, target);
	        result[1] = findLast(nums, target);
	        return result;
	    }

	    private static int findFirst(int[] nums, int target){
	        int idx = -1;
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(nums[mid] >= target){
	                end = mid - 1;
	            }else{
	                start = mid + 1;
	            }
	            if(nums[mid] == target) idx = mid;
	        }
	        return idx;
	    }

	    private static int findLast(int[] nums, int target){
	        int idx = -1;
	        int start = 0;
	        int end = nums.length - 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(nums[mid] <= target){
	                start = mid + 1;
	            }else{
	                end = mid - 1;
	            }
	            if(nums[mid] == target) idx = mid;
	        }
	        return idx;
	
	    }
	    
	    public static void main(String args[]){
	    	
	    	int[] nums = {5,7,7,8,8,10};
	    	int target = 8;
	    int[] result = searchR(nums, target);
	    for(int i =0; i<result.length; i++){
	    	System.out.println(result[i]);
	    }
	    }
	
}
