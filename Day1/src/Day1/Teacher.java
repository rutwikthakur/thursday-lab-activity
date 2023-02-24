package Day1;

public class Teacher {



	import java.util.Scanner;

	
		public void setMarks(Student student) {
			
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Roll No: "+student.rollNumber);
	        System.out.println("Enter marks for "+student.name);
	        
	        for (Subject subject : student.subjects) 
	        {
	            System.out.print(subject.subjectName + ": ");
	            int marks = sc.nextInt();
	            subject.setMarks(marks);
	        }
	    }
		
		
		public static void main(String[] args) {
			
		    Student[] students = new Student[10];
		    
		    students[0] = new Student("Naya", 1);
		    students[1] = new Student("Ishaan", 2);
		    students[2] = new Student("Jai", 3);
		    students[3] = new Student("Inaya", 4);
		    students[4] = new Student("Amar", 5);
		    students[5] = new Student("Navi", 6);
		    students[6] = new Student("Dhruv", 7);
		    students[7] = new Student("Kanan", 8);
		    students[8] = new Student("Priti", 9);
		    students[9] = new Student("Reva", 10);

		    Teacher teacher = new Teacher();
	        for (Student student : students) 
	        {
	            teacher.setMarks(student);
	        }
	        
	        int totalMarks = 0;
	        int maxMarks = Integer.MIN_VALUE;
	        int minMarks = Integer.MAX_VALUE;
	        for (Student student : students) 
	        {
	            for (Subject subject : student.subjects) 
	            {
	                totalMarks += subject.subjectMarks;
	                maxMarks = Math.max(maxMarks, subject.subjectMarks);
	                minMarks = Math.min(minMarks, subject.subjectMarks);
	            }
	        }
	        
	        int averageMarks = totalMarks / (students.length * 2);
	        System.out.println("Average marks: " + averageMarks);
	        System.out.println("Maximum marks: " + maxMarks);
	        System.out.println("Minimum marks: " + minMarks);
		

	

}
}
