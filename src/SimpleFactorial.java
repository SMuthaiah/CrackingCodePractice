
public class SimpleFactorial {
	
	public int Factorial(int n){
		
		int fact=1;
		
		for(int i=1;i<n;i++){
			
			fact = fact * i;
			
		}
		
		return fact;
		
	}
	
	public int factorialRecursion(int n){
		
		if(n==0)
			return 1;
		
		else
		return n*factorialRecursion(n-1);
		
		
	}

}
