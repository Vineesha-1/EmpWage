
public class EmpWage {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int empCheck = (int) (Math.floor(Math.random()*10)%2);;
		// int rand_int2 = rand.nextInt(1000);

		 // Print random integers
		 System.out.println("Random Integers: "+empCheck);
		 //System.out.println("Random Integers: "+rand_int2);
		 switch (empCheck) {
		 case 1:   empHrs=8;
		          System.out.print("full time");
		          break;
		 case 2:  empHrs=4;
		          System.out.print("part time");
		          break;
		 case 0:  empHrs=0;
		          System.out.println("absent");
		          break;
		 
		 default:empHrs=0;
		          break;
		 }
		 empWage=empHrs*EMP_RATE_PER_HOUR;
		 System.out.println("emp wage"+empWage);

	}
}

