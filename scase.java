package scase;

public class scase {
	static int amt=20000;
    public static void main(String[] args)
    {
         
    	System.out.println("Enter 1 to credit:");
    	System.out.println("Enter 2 to Debit: ");
    	System.out.println("Enter 3 to Display:");
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    	System.out.println("Enter your choice:");
    	int n=sc.nextInt();
    	switch(n)
    	{
    	case 1:{
    		
    		System.out.println("Enter the amount you want to credit:");
    		int a=sc.nextInt();
    		amt=amt+a;
    		break;
    		
    		
    	}
    	case 2:
    	{
   
    		System.out.println("Enter the amount you want to Debit:");
    		int b=sc.nextInt();
    		if(b>amt)
    		{
    			System.out.println("Insufficient Balance:");
    			
    		}
    		else {
    			amt=amt-b;
    		}
    		break;
    		
    	}
    	case 3:
    	{
    		System.out.println(amt);
    		break;
    	}
    	default:
    	{
    		System.out.println("OOPS INVALID CHOICE:");
    	}
    	}
    	
    	
    }
    
}
