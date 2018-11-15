package lab7;

public class Student {
	
	private String firstName, lastName;
	private final int id;
	private int attemptedCredits, passingCredits;
	private double gradePoint, bearBucks, totalGrade;
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.attemptedCredits = 0;
		this.passingCredits = 0;
		this.gradePoint = 0;
		this.bearBucks = 0;
		this.totalGrade = 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @param grade
	 * @param credits
	 */
	public void submitGrade(double grade, int credits) {
		this.gradePoint = this.gradePoint + grade*credits;
		this.totalGrade = this.totalGrade + grade;
		this.attemptedCredits = this.attemptedCredits + credits;
		if(grade>1.70) {
			this.passingCredits = this.passingCredits + credits;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotalAttemptedCredits() {
		return this.attemptedCredits;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotalPassingCredits() {
		return this.passingCredits;
	}
	
	/**
	 * 
	 * @return
	 */
	public double calculateGradePointAverage() {
		return this.gradePoint/this.attemptedCredits;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getClassStanding() {
		if(this.passingCredits<30) {
			return "FirstYear";
		}
		else {
			if(this.passingCredits<60) {
				return "Sophomore";
			}
			else {
				if(this.passingCredits<90) {
					return "Junior";
				}
				else {
					return "Senior";
				}
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEligibleForPhiBetaKappa() {
		if(this.passingCredits>=98&&this.calculateGradePointAverage()>=3.6||this.passingCredits>=75&&this.calculateGradePointAverage()>=3.8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param amount
	 */
	public void depositBearBucks(double amount) {
		this.bearBucks = this.bearBucks + amount;
	}
	
	/**
	 * 
	 * @param amount
	 */
	public void deductBearBucks(double amount) {
		this.bearBucks -= amount;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getBearBucksBalance() {
		return this.bearBucks;
	}
	
	/**
	 * 
	 * @return
	 */
	public double cashOutBearBucks() {
		if(this.bearBucks>10) {
			return this.bearBucks - 10;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param firstName
	 * @param otherParent
	 * @param isHyphenated
	 * @param id
	 * @return
	 */
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		if(isHyphenated) {
			Student n = new Student(firstName, this.lastName+"-"+otherParent.lastName, id);
			n.bearBucks = otherParent.cashOutBearBucks() + this.cashOutBearBucks();
			this.deductBearBucks(this.getBearBucksBalance());
			otherParent.deductBearBucks(otherParent.getBearBucksBalance());
			return n;
		}
		else {
			Student n = new Student(firstName, this.lastName, id);
			n.bearBucks = otherParent.cashOutBearBucks() + this.cashOutBearBucks();
			this.deductBearBucks(this.getBearBucksBalance());
			otherParent.deductBearBucks(otherParent.getBearBucksBalance());
			return  n;
		}
		
		
	}

	
	@Override
	public String toString() {
		return  firstName + " " + lastName + id;
	}

	

}
