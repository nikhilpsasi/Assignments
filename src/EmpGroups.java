
public class EmpGroups {

	static int [] emp_id=new int[3];
	static String [] emp_name= new String[3];

	private static int employee_id1 = 1;
	private static int employee_id2 = 2;
	private static int employee_id3 = 3;
	private static String employee_name1 = "Nikhil";
	private static String employee_name2 = "Dilip";
	private static String employee_name3 = "Anandhu";



	public static void main(String[] args) 
	{
		emp_id [0]=EmpGroups.employee_id1;
		emp_id [1]=EmpGroups.employee_id2;
		emp_id [2]=EmpGroups.employee_id3;

		emp_name[0]=EmpGroups.employee_name1;
		emp_name[1]=EmpGroups.employee_name2;
		emp_name[2]=EmpGroups.employee_name3;

		System.out.println("Employee Name: "+emp_name[0]+", Employee ID: "+emp_id [0]);
		System.out.println("Employee Name: "+emp_name[1]+", Employee ID: "+emp_id [1]);
		System.out.println("Employee Name: "+emp_name[2]+", Employee ID: "+emp_id [2]);
	}
}

