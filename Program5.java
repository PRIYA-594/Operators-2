package OPerators2;
import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		char result= (len%2==0)?(str.charAt(len-1)):(str.charAt(len/2));
		System.out.println(result);
		s.close();
	}
}
