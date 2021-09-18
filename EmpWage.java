
public class EmpWage {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int empCheck = (int) (Math.floor(Math.random()*10)%2);;
		// int rand_int2 = rand.nextInt(1000);

		 // Print random integers
		 System.out.println("Random Integers: "+empCheck);
		 //System.out.println("Random Integers: "+rand_int2);

		 if(empCheck==1)
		 {
			   System.out.println("employee present");
			   empHrs=8;
			   
		 }
		 else
		 {
			   System.out.println("employee absent");
			   empHrs=0;
		 }
		 empWage=empHrs*EMP_RATE_PER_HOUR;
		 System.out.println("emp wage"+empWage);

	}

}
