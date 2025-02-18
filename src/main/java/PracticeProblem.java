public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(pluralize("LifY"));
	}
	public static String pluralize(String word) {
		if (word.endsWith("y")){ 
			return "ies";
		}
		else if (word.equalsIgnoreCase("ey") && word.endsWith("ey")){
				return "eys";
			}
		else if (word.equalsIgnoreCase("ife") & word.endsWith("ife")){
			return "ives";
		}
		else {
			return "s";
		}
	}

	public static int min(int num1, int num2, int num3){
		if ((num1 < num2) && (num1 < num3)){
			return num1;
		}
		else if ((num2 < num1) && (num2 < num3)){
			return num2;
		}
	else {
		return num3;
	}
	}

	public static boolean isLeapYear(int year){
		if ((year/4)%2 == 0) {
			if ((year/100)%2 == 0){
				if ((year/400)%2 == 0){
					return true;
				}
			}
		}
		else {
			return false;
		}
	}
}
