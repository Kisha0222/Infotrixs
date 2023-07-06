class kishore
{
	String name;
	String empname;
	int employee_id;
	double salary;
	
	 kishore()
	{

	}
	kishore(String name,String empname,int employee_id,double salary)
	{
		this.name=name;
		this.empname=empname;
		this.employee_id=employee_id;
		this.salary=salary;
	}
	public void DetailsOfkishore()
	{
		System.out.println("THE SECOND EMPLOYEE'S COMPANY_NAME IS :"+name); 
		System.out.println("THE SECOND EMPLOYEE'S NAME IS :"+empname); 
		System.out.println("THE SECOND EMPLOYEE'S EMPLOYEE_ID IS :"+employee_id);
		System.out.println("THE SECOND EMPLOYEE'S SALARY IS :"+salary);
		System.out.println("*************************************");
	}

}  
	