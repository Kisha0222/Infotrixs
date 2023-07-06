class navin
{
	String name;
	String empname;
	int employee_id;
	double salary;
	navin(){
	}
	navin(String name,String empname,int employee_id,double salary)
	{
		this.name=name;
		this.empname=empname;
		this.employee_id=employee_id;
		this.salary=salary;
		
	}
	public void DetailsOfnavin()
	{
		System.out.println("THE FIRST EMPLOYEE'S COMPANY NAME IS :"+name);
		System.out.println("THE FIRST EMPLOYEE'S NAME IS :"+empname);
		System.out.println("THE FIRST EMPLOYEE'S EMPLOYEE_ID IS :"+employee_id);
		System.out.println("THE FIRST EMPLOYEE'S SALARY IS :"+salary);
		System.out.println("******************************");
	}
}
