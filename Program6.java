package OPerators2;
import java.util.*;
public class Program6 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(str.length()-1);
		String result = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"true":"false";
		System.out.println(result);
		s.close();
	}
}
