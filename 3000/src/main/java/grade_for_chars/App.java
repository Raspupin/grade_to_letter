package grade_for_chars;


public class App 
{
	public static String returnAGrade(int numbericGrade) {
		if(numbericGrade >= 1 && numbericGrade <=49 ) {
			return "F";
		}
		if(numbericGrade >= 50 && numbericGrade <=59 ) {
			return "E";
		}
		if(numbericGrade >= 60 && numbericGrade <=69 ) {
			return "D";
		}
		if(numbericGrade >= 70 && numbericGrade <=79 ) {
			return "C";
		}
		
		if(numbericGrade >= 80 && numbericGrade <=89 ) {
			return "B";
		}
		if(numbericGrade >= 90 && numbericGrade <=100 ) {
			return "A";
		}
		return "Error";
	}
	
    public static void main( String[] args )
    {
        System.out.println(returnAGrade(61));
    }
}
