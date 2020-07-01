package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_01 {
	
	    public String solution(String[] participant, String[] completion) {
	    	//Programmers> Hash> 완주하지 못한 선수
	    	//Arrays.sort 오름차순 정렬 사용
	    	//내림차순이나 원하는 대로 정렬조건을 달리 하려면 Comparable/ Comparator사용
	       
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
	    
	    //HashMap사용
	    public String solution2(String[] participant, String[] completion) {
	       String answer="";
	       
	       HashMap<String, Integer> name = new HashMap<>();
	       for(String player:participant) name.put(player, name.getOrDefault(player, 0)+1);
	       for(String player:completion) name.put(player, name.get(player)-1);
	       
	       for(String key: name.keySet()) {
	    	   if(name.get(key)!=0) {
	    		   answer=key;
	    	   }
	       }
	            
	       
	       return answer;
	       
	       
	        
	    }
	    

}
