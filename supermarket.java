import java.io.*;
class supermarket
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("KEERTHI SUPER MARKET");
	System.out.println("No.4,Main road,Villupuram");
        System.out.println("-----------------------");
	System.out.println("BILL");
	System.out.println("-----------------------");
        System.out.println("Enter the serial no:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter the particulars:");
        String s2=br.readLine();
        System.out.println("Enter the rate:");
	String s3 = br.readLine();
        int x = Integer.parseInt(s3);
	System.out.println("Enter the quantity:");
	String s4 = br.readLine();
        int y = Integer.parseInt(s4);
        System.out.println("Result");
        int z = x*y;
        System.out.println("Total Amount:" + z);
        int w = z*10/100;
        System.out.println("Average:" + w);
	int m = z+w;
	System.out.println("Grand Total:" + m);
	System.out.println("---------------------------");
	System.out.println("Thanks! Visit Again!");

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
