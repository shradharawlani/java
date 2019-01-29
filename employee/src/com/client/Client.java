package com.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.bean.Employee;
import com.bean.Payslip;

public class Client {

	public static void main(String[] args) {
		Map<Employee,Set<Payslip>> e=new HashMap<Employee,Set<Payslip>>();
		//Client c=new Client();
		populateEmployeeDetails(e);
		populatePayslipDetails(e);
		filterEmployeeRecordsByMonth(e, "may");
		
	}
	
	public static void populateEmployeeDetails(Map<Employee, Set<Payslip>> e1) {
		
		Set <Employee> e=new HashSet<Employee>();
		
		
		e1.put((new Employee("345678","Aamir Khan","Manager")),null);
		e1.put((new Employee("011143"	,"Imran Khan"	,"Module Lead")),null);
		e1.put((new Employee("008971",	"Rajnikanth",	"Managing Director")),null);
		e1.put((new Employee("A03404"	,"Triloknath" ,"Anna	Consultant")),null);
		e1.put((new Employee("008644","Irfan Khan","Team Lead")),null);


	}
	
	public static void populatePayslipDetails(Map<Employee, Set<Payslip>> employeeDetails) {
Set <Payslip> e=new HashSet<Payslip>();
		employeeDetails.put(null, e);
		
		e.add(new Payslip(1,"August"	,"010052"	,25000,	7500,	1250,	1750	,8500,	650));
		
		e.add(new Payslip(2,"May","008644",15000,	7500	,1250	,1750	,6500,	650));
				/*e.add(new PayslipJune	011143	10000	7500	1250	1750	5000	650
			e.add(new Payslip010052	25000	7500	1250	1750	9500	650
					e.add(new PayslipMay008644	15000	7500	1250	1750	7000	650
							e.add(new PayslipMayAugust	008971	50000	7500	1250	1750	12500	650
									e.add(new PayslipMayMarch	A03404	5000	7500	1250	1750	1500	650
											e.add(new PayslipMay008971	50000	7500	1250	1750	0	650
													e.add(new PayslipMayMay	008971	50000	7500	1250	1750	10000	650
															e.add(new PayslipMayMay	A03404	5000	7500	1250	1750	3500	650*/

	}
	
	public static Map<Employee, Payslip> filterEmployeeRecordsByMonth(Map<Employee, Set<Payslip>> employeeDetails, String month) {
		Map<Employee, Payslip> filteredRecords = new HashMap<Employee, Payslip>();
		 for(Map.Entry<Employee, Payslip> entry:filteredRecords.entrySet()){    
			    
	System.out.println(entry.getKey());
		 }
		return filteredRecords;
	}
	
	public static Map<Employee, Set<Payslip>> sortEmployeeRecordsByName(Map<Employee, Set<Payslip>> employeeDetails) {
		Map<Employee, Set<Payslip>> sortedRecords = new TreeMap<Employee, Set<Payslip>>();
		/* write your code here */
		return sortedRecords;
	}
}
