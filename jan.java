import java.util.Scanner;

public class c_compareTo
{

    /* int compareTo(String anotherString)
    Compares two strings lexicographically
    
    boolean equals(Object anObject)
    Compares this string to the specified object.  */
    
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter 2 strings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
        
        if(s1.equals(s2)==true)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
