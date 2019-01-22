package com.psl.main;
import java.util.*;

public class Game {
	public static void main(String[] args) {
		int i=0,j=0;
	Scanner s=new Scanner(System.in);
	char[][] ch=new char[3][3];

     for( i=0;i<3;i++)
     {
    	 for( j=0;j<3;j++)
    	 {
    		 ch[i][j]=s.next().charAt(0);
    		 
    	 }
    	 
		
	}
     for( i=0;i<3;i++)
     {
    	 for( j=0;j<3;j++)
    	 {
    		 System.out.print(ch[i][j]);
    		 
    	 }
    	 
		
	}
     for(i=0;i<3;i++)
     {
          j=0;
    	 if(ch[i][j]==ch[i][j+1]&&ch[i][j+1]==ch[i][j+2])
    	 {
    		System.out.println("Valid");
    	 }
    	 


     }
     for(i=0;i<3;i++)
     {
         j=0;
    	 if(ch[j][i]==ch[j+1][i]&&ch[j+1][i]==ch[j+2][i])
    	 {
    		System.out.println("Valid");
    	 }
    	 


     }
     
         i=0;
         j=0;
    	 if(ch[i][j]==ch[i+1][j+1]&&ch[j+1][i+1]==ch[j+2][i+2])
    	 {
    		System.out.println("Valid");
    	 }
    	 i=2;
         j=2;
    	 if(ch[i-2][j]==ch[i-1][j-1]&&ch[j-1][i-1]==ch[j][i-2])
    	 {
    		System.out.println("Valid");
    	 }
    	 


     
	}
}
