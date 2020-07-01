package Programmers;

public class tower {

	
	//ž
    public int[] solution(int[] heights) {
       
    	int towerNum= heights.length;
    	int[] answer = new int[towerNum];
        //
    	for(int sender=towerNum-1; sender>0; sender--) {
    		for(int receiver=0; receiver<sender; receiver++) {
    			if(heights[receiver]>heights[sender]) {
    				answer[sender]=receiver+1;
    			}
    		}
    	}
        
        
        
        
        return answer;
    }
	        
	        
	     
	
	
	
	
}
