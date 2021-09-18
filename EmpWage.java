
public class EmpWage {

	//private static final int NUM_OF_WORKING_DAYS = 0;
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int empHr;
			int empWage;
			int totalEmpWage = 0;
	System.out.print("Welcome to Employee Wage Computation Program on Master Branch");
	for(int day=0;day<NUM_OF_WORKING_DAYS;day++)
	{
	int empCheck = (int) (Math.floor(Math.random()*10)%3);;
	System.out.println("Random Integers: "+empCheck);
	 //System.out.println("Random Integers: "+rand_int2);

	 switch (empCheck) {
	 case 1:   empHr=8;
	          System.out.print("full time");
	          break;
	 case 2:  empHr=4;
	          System.out.print("part time");
	          break;
	 case 0:  empHr=0;
	          System.out.println("absent");
	          break;
	 
	 default:empHr=0;
	          break;
	}
	 empWage=empHr*EMP_RATE_PER_HOUR;
	 totalEmpWage+=empWage;
	System.out.println("emp wage"+empWage);
		
		}
	System.out.println("Total emp wage"+totalEmpWage);
		}
	}

