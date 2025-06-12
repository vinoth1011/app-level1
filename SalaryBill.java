import java.io.*;
class salbill
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("KEERTHI INTERNATION [P]Ltd.");
	System.out.println("Ongur,Tindivanam,Villupuram");
        System.out.println("-----------------------");
	System.out.println("Salary Bill Receipt");
	System.out.println("-----------------------");
        System.out.println("Enter the Empoyee Id:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter the Employee Name:");
        String s2=br.readLine();
        System.out.println("Enter the Salary:");
	String s3 = br.readLine();
        int x = Integer.parseInt(s3);
	System.out.println("INCOME");
	int b = x*20/100;
	System.out.println("Bonus(20% from sal):" + b);
	int i = x*10/100;
	System.out.println("Increment(10% from sal):" + i);
	int o = x*5/100;
	System.out.println("Overtime(5% from sal):" + o);
	int g = b + i + o + x;
        System.out.println("Grand Total:" + g);
        System.out.println("EXPENDITURE");
	int l = x*2/100;
	System.out.println("LIC(2% from sal):" + l);
	int h = x*3/100;
	System.out.println("HRA(3% from sal):" + h);
	int n = g - l - h ;
	System.out.println("Net Total:" + n);

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
