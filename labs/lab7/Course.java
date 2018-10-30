package lab7;

import lab7.tests.student.StudentStandingTest;

public class Course {
	
	private final String name;
	private final int credits;
	private int capacity, seatsTaken;
	private Student[] roster;
	
	/**
	 * 
	 * @param name
	 * @param credits
	 * @param capacity
	 */
	public Course(String name, int credits, int capacity) {
		this.name = name;
		this.credits = credits;
		this.capacity = capacity;
		this.seatsTaken = 0;
		this.roster = new Student[this.capacity];
	}
	public String getName() {
		return this.name;
	}
	public int getCredits() {
		return this.credits;
	}
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getSeatsRemaining() {
		return this.capacity - this.seatsTaken;
	}
	
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean addStudent(Student s) {
		int ans = 0;
		int j = 0;
		for(int i=0; i<this.seatsTaken; ++i) {
			if(this.roster[i].equals(s)) {
				ans = 1;
			}
		}
		if(ans==1) {
			return false;
		}
		else {
			if(this.capacity-this.seatsTaken>0) {
				while(j<this.capacity) {
					if(this.roster[j]==null) {
						this.roster[j]=s;
						break;
					}
					else {
						++j;
					}
				}
				this.seatsTaken += 1;
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String generateRoster() {
		String[] name = new String[this.capacity];
		String ans = "";
		for(int i=0; i<this.capacity; ++i) {
			if(roster[i]!=null) {
				name[i] = roster[i].getFullName();
			}
		}
		for(int i=0; i<this.capacity; ++i) {
			if(name[i]!=null) {
				ans = ans + " " + name[i];
			}
		}
		return ans;
	}
	
	/**
	 * 
	 * @return
	 */
	public double calculateAverageGPA() {
		double[] gpa = new double[this.capacity];
		double grade = 0;
		for(int i=0; i<this.capacity; ++i) {
			if(roster[i]!=null) {
				gpa[i] = roster[i].calculateGradePointAverage();
			}
		}
		for(int i=0; i<this.capacity; i++) {
			grade = grade + gpa[i];
		}
		return grade/this.seatsTaken;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return name + credits ;
	}
	
	
	
	
	
	
	
	
	

}
