import java.io.*;
class arith
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("ARTHIMETIC OPERATIONS");
        System.out.println("-----------------------");
        System.out.println("Enter the first no:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter the second no:");
        String s2=br.readLine();
        int b = Integer.parseInt(s2);
        System.out.println("Result");
        int x = a+b;
        System.out.println("Add:" + x);
        int y = a-b;
        System.out.println("sub:" + y);

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
