package Programmers;

import java.util.*;

public class land {
	    int solution(int[][] land) {
	        
	       for ( int i = 1; i < land.length; i ++ ) {
				for ( int j=0; j < land[i-1].length; j++ ) {
					int max = 0 ;
					for ( int k=0; k < land[i-1].length; k++ ) {
						if( k==j ) continue;
						max = Math.max(max,land[i-1][k]);    						
					}
					land[i][j] += max ;
				}
			}

			int[] answer = land[land.length-1];
			Arrays.sort(answer);

			return answer[answer.length-1] ;
	    }
	


//다른 풀이
	    
	    

	    int hopscotch(int[][] board, int size) {
	        for(int i=1; i<size; i++) {
	            board[i][0] += Math.max(board[i-1][1], Math.max(board[i-1][2], board[i-1][3]));
	            board[i][1] += Math.max(board[i-1][0], Math.max(board[i-1][2], board[i-1][3]));
	            board[i][2] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][3]));
	            board[i][3] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][2]));
	        }
	        return Math.max(board[size-1][0], Math.max(board[size-1][1], Math.max(board[size-1][2], board[size-1][3])));
	    }






}


