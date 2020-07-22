import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListStrings {
	public static void main(String[] arg)
	{
		String[] arr={"Aaron","And","ant","abh","arr"};
		List<String> strList=Arrays.asList(arr);
		List<String> a_list=filter(strList,(String str)->{
			return (str.charAt(0)=='a' && str.length()==3);
			}
		);
		System.out.print(a_list);
		
	}

	private static List<String> filter(List<String> strList, Predicate<String> predicate) 
	{
		List<String> startsWithA=new ArrayList<String>();
		for(String str: strList)
		{
			if(predicate.test(str))
			{
				startsWithA.add(str);
			}
		}
		return startsWithA;
	}
}