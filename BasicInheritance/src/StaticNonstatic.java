//Call static and non-static member functions of a class
class Student {
	int rollNo=27;
	static String schoolName="SFIT";
	
	int getNextRollNo() { //non-static member function
		this.rollNo++;
		return rollNo;
	}
	static String getSchoolName() { //static member function
		return schoolName;
	}
}
class StaticNonstatic {
	public static void main(String[] args) {
		
		Student student=new Student(); //Create an object of class Student
		
		//Call static and non-static member functions of class Student
		System.out.println("Next roll number is "+student.getNextRollNo());
		System.out.println("School name is "+Student.getSchoolName());
	}
}
