package OPerators2;
import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String result = ((num%10)%2==0)?"Even":"Odd";
		System.out.println(result);
		s.close();
	}
}
