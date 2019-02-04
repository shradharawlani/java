package com.psl;

import java.util.ArrayList;
import java.util.List;

import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;
import com.psl.util.StudentDataManager;




public class Client  {
	
	public static void main(String[] args) {
		
		//Create instance of StudentDataManager Class here and  test your functionality from here
		 StudentDataManager sd=new StudentDataManager();
		   List<Student> s=new ArrayList<Student>();
			s= sd.populateData("StudentDetails.txt");
			/*for(Student st:s)
			{
				System.out.println(st.getStudentName()+st.getAge());
			}*/
			sd.sortData(s);
			System.out.println(s);
			/*try {
				sd.validateData(s);
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}*/
	}
}
