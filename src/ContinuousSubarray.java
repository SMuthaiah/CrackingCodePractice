import java.util.Stack;

public class ContinuousSubarray {

	
	public static int continuousSubarray(int [] nums){
		 
		int min = 0, max = 0;
		 
		for (int i=0; i<nums.length;i++){
		min = Math.min(min, nums[i]);
		max = Math.max(max,nums[i]);
		}
		 
		int j=0;
		while(nums[j]>=min){
		min = nums[j];
		j++;
		}
		
		int lowerLimit= j;
		 
		int k=nums.length-1;
		while(nums[k]<=max){
		max = nums[k];
		k--;
		}
		int upperLimit =k;
		
		int ll=0;
		int rl = 0;
		for(int u=0;u<nums.length;u++){
			
			if(nums[u]>nums[j])
				ll = u;
			
		}
		
		for(int n=nums.length-1;n<0;n--){
			
			if(nums[n]<nums[k]){
				rl = n;
			}
			
		}
		 
		return (rl-ll<0 ? 0 : rl-ll +1);
		 
		}
	
	
	public static int continuousSubArrayUsingStack(int[] nums){
		 Stack < Integer > stack = new Stack < Integer > ();
	        int l = nums.length, r = 0;
	        for (int i = 0; i < nums.length; i++) {
	            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
	                l = Math.min(l, stack.pop());
	            stack.push(i);
	        }
	        stack.clear();
	        for (int i = nums.length - 1; i >= 0; i--) {
	            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
	                r = Math.max(r, stack.pop());
	            stack.push(i);
	        }
	        return r - l > 0 ? r - l + 1 : 0;
	}
	
	
	
	

	
	public static void main(String args[]){
		
		int[] nums = {2,6,4,8,10,9,7,15};
		System.out.println(continuousSubArrayUsingStack(nums));
		
	}
	
	
}
