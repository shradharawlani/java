package com.psl.main;

public class Array {
         public static void main(String[] args) {
			boolean res=LinearSearch.linearSearch(1,9,4,6,6);
			if(res==true)
			{
				System.out.println("element found");
			}
			else 
			{
				System.out.println("element not found");
			}
		
         int ans[]=LinearSearch.sort(3,7,1,3,9);
         System.out.println("Sorted Array");
         for(int val:ans)
         {
        	 System.out.println(val);
         }
}
         
}