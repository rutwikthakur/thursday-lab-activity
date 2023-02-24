package Day1;

public class Student {
	
	

		//Student class has three fields i.e. name, rollNumber and subjects
		 String name;
		 int rollNumber;
		 Subject[] subjects;
		    
		    public Student(String name, int rollNumber) {
		        this.name = name;
		        this.rollNumber = rollNumber;
		        this.subjects = new Subject[2];
		        this.subjects[0] = new Subject("Maths");
		        this.subjects[1] = new Subject("English");
		    
	    
	}

}
