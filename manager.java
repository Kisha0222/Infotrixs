class manager 
{
	String manager_name;
	String mgr_cop_name;
	int mgr_id;
	double salary;

	manager(){
	}
	manager(String mgr_cop_name,String manager_name,int mgr_id,double salary)
	{
		
		this.manager_name=manager_name;
		this.mgr_cop_name=mgr_cop_name;
		this.mgr_id=mgr_id;
		this.salary=salary;
	}
	navin n=new navin("ZOHO","NAVIN",35665487,350000);
	kishore k=new kishore("ZOHO","KISHORE",56454321,400000);
	public void DetailsOfmanager()
	{
		System.out.println("THE MANAGER NAME IS :"+manager_name);
		System.out.println("THE MANAGER COMPANY_NAME IS :"+mgr_cop_name);
		System.out.println("THE MANAGER ID IS :"+mgr_id);
		System.out.println("THE MANAGER SALARY IS :"+salary);
		System.out.println("******************************");

	}
}