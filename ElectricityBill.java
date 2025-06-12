import java.io.*;
class bill
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
        System.out.println("GOVERNMENT OF TAMILNADU");
	System.out.println("Electricity Bill");
	System.out.println("-----------------------");
        System.out.println("Enter the EB-no:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter the customer name:");
        String s2=br.readLine();
        System.out.println("Enter the prev unit:");
	String s3 = br.readLine();
        int x = Integer.parseInt(s3);
	System.out.println("Enter the current unit:");
	String s4 = br.readLine();
        int y = Integer.parseInt(s4);
        System.out.println("Result");
        int z = y-x;
        System.out.println("Unit Consumed:" + z);
        int w = z*5;
        System.out.println("Total Amount:" + w);
	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
