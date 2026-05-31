package MayWeek1;

public class SchoolGrade {

	public static void main(String[] args) {

//		String result = getGrade(50);
//		System.out.println(result);
//		System.out.println(getGradeTest(92));
		testFallThrough(2);
	}

	public static String getGrade(int marks) {

		if (marks < 0 || marks > 100) {
			return "Invalid Marks";
		} else if (marks <= 0) {
			return "Exam not attended";
		} else if (marks >= 90) {
			return "Grade A";
		} else if (marks >= 70) {
			return "Grade B";
		} else if (marks >= 50) {
			return "Grade C";
		} else if (marks >= 30) {
			return "Grade D";
		} else {
			return "Fail";

		}
	}
	
	
	/**
	 * “Switch works best for exact values, not ranges.
	 * For range-based logic like grading, if-else is more readable and maintainable.”
	 * @param marks
	 * @return
	 */
	
	public static String getGradeTest(int marks) {
		if(marks <0 || marks >100) return "Invalid Marks";
				
		switch(marks/10) {
		case 9 : return "Grade A";
		case 7 : return "Grade B";
		case 5 : return "Grade C";
		case 3 : return "Grade D";
		default : return "Fail";
		}
	}
	
	
	public static void testFallThrough(int x) {
		
		switch(x) {
		case 1: System.out.println("Hello");
		case 2: System.out.println("Hello");
		case 3: System.out.println("Hello");
		case 4: System.out.println("Hello");
		case 5: System.out.println("Hello");
		default : System.out.println("Bye");
		
		
		}
	}
}
