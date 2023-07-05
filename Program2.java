package OPerators2;
import java.util.*;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println((int)str.charAt(str.length()-1));
		s.close();
	}
}
