package studio9;

import java.util.HashMap;
import java.util.Map;

import lab7.Student;

public class UniversityDatabase {
	
	private final Map<String, Student> uData;

	public UniversityDatabase() {
		this.uData = new HashMap<String, Student>();
	}
	
	public void addStudent(String accountName, Student student) {
		uData.put(accountName, student);
	}
	
	public int getStudentCount() {
		return uData.size();
	}
	
	 public String lookupFullName(String accountName) {
		 String fullName = "";
		 if(uData.get(accountName)!=null) {
			 fullName = uData.get(accountName).getFullName();
			 return fullName;
		 }
		 else {
			 return null;
		 }
		
	 }
	 
	 public double getTotalBearBucks() {
		 double ans = 0;
		 for(String key : uData.keySet()) {
			 ans = ans + uData.get(key).getBearBucksBalance();
		 }
		 return ans;
	 }

	@Override
	public String toString() {
		return "UniversityDatabase [uData=" + uData + "]";
	}
	 
	 

}
