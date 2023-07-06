import java.util.*;
class employee
{

	static Scanner s=new Scanner(System.in);
	static boolean b1=true;
	static manager m =new manager("ZOHO","RAM",354354,550000);

	public static void main (String[]args)throws Exception
	{
	do
	{
		System.out.println("\t\tSELECT THE INPUTS \n");
		System.out.println("1.DETAILS OF MANAGER\n2.DETAILS OF FIRST EMPLOYEE\n3.DETAILS OF SECOND EMPLOYEEE\n4.EXIT");
		int data = s.nextInt();
		switch (data)
		{
		case 1: {
			System.out.println("processing....");
			Thread.sleep(3000);
			m.DetailsOfmanager();
			break;}
			case 2: {
				System.out.println("processing....");
			Thread.sleep(3000);
			m.n.DetailsOfnavin();
			break;}
			case 3: {
				System.out.println("processing....");
			Thread.sleep(3000);
			m.k.DetailsOfkishore();
			break;}
			case 4:{
				b1=false;
				System.out.println("processing.....");
				Thread.sleep(3000);
				System.out.println("***********************THANK YOU***********************");
			
			break;}
		}
	}
	while (b1);
	}
}
