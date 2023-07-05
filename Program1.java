package OPerators2;
import java.util.*;
public class Program1 {
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = Integer.toString(n);
		String result = str.length()==2?"True":"False";
		System.out.println(result);
		s.close();
	}
}
