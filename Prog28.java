import java.io.*;

class Prog28
{
    public static void main(String[] args)
    {
        String s = "Sachin ";
        String ostr = " ";
        int l1;
        l1 = s.length();
        for(int i=0;i<l1;i++)
        {
            ostr += s.charAt(i);
        }
        String s1 = "Tendulkar";
        int l2;
        l2 = s1.length();
        for(int j=0;j<l2;j++)
        {
            ostr += s1.charAt(j);
        }
        System.out.println("Concatenated String:"+ostr);
    }
}