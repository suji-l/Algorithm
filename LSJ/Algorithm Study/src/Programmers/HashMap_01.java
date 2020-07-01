package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_01 {
	
	    public String solution(String[] participant, String[] completion) {
	    	//Programmers> Hash> �������� ���� ����
	    	//Arrays.sort �������� ���� ���
	    	//���������̳� ���ϴ� ��� ���������� �޸� �Ϸ��� Comparable/ Comparator���
	       
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
	    
	    //HashMap���
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
