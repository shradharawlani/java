package com.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;

// Override and implement all the methods of DataManager Interface here
public class DataManagerImpl implements DataManager {

	@Override
	public List<Question> populateData() {
		List<Question> qlist=new ArrayList<Question>();
		Connection con;
		try {
			con = new DatabaseConnectionManager().getConnection();
			Statement smt=con.createStatement();
			ResultSet rs;
			rs=smt.executeQuery("select * from questionbank");
			while(rs.next())
			{
				 String question=rs.getString(1);
				String option1=rs.getString(2);
				 String option2=rs.getString(3);
	              String option3=rs.getString(4);
				 String option4=rs.getString(5);
				  String correctAns=rs.getString(6);
				  String Category=rs.getString(7);
				 String complexity=rs.getString(8);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qlist;
	}

	@Override
	public List<Question> getQuestionByCategory(Category category, List<Question> questionsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getQuestionByComplexity(Complexity complexity, List<Question> questionsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Question> generateQuestionPaper(List<Question> list, List<Criteria> template) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortByCategory(List<Question> questionList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByComplexity(List<Question> questionList) {
		// TODO Auto-generated method stub
		
	}


}