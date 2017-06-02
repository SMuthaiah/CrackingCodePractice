
public class reshapedMatrix {
	
	    public int[][] matrixReshape(int[][] nums, int r, int c) {
	        int row = nums.length;
	        int col = nums[0].length; //assume all the rows are of same length
	        
	        if(row * col != r * c)
	             return nums; 
	             
	        int[][] reshapedMatrix = new int[r][c];
	        int tempR= 0;
	        int tempC = 0;
	        
	        for(int i=0; i<row;i++){
	            for(int j=0;j<col;j++){
	                reshapedMatrix[tempR][tempC] = nums[i][j];
                    tempC++;
		
                    if(tempC == c){
                    	tempR++;
                    	tempC =0;
                    }

	                
	            }
	        }
	        
	        return reshapedMatrix;
	        
	}

}
