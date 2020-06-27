package Programmers;

import java.util.Arrays;

public class HashMap_01 {
	
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        int i = 0;
	        for (i=0; i<completion.length;i++) {
	        	if(!participant[i].equals(completion)) {
	        		return participant[i];
	        		
	        	}
	        	
	        }
	        	        
	        return participant[i];
	        
	        
	    }

	    public String solution2(String[] participant, String[] completion) {
	    	
	    	String answer="";
	    	return answer;
	    }
	
}
