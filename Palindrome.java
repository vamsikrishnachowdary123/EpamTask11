import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] arg)
	{
		String[] arr={"aba","cbabc","madam","man","arr","mom","radar"};
		List<String> strList=Arrays.asList(arr);
		List<String> a_list=filter(strList,(String str)->{
			 return new StringBuilder(str).reverse().toString().equals(str);
			}
		);
		System.out.print(a_list);
		
	}

	private static List<String> filter(List<String> strList, Predicate<String> predicate) 
	{
		List<String> palList=new ArrayList<String>();
		for(String str: strList)
		{
			if(predicate.test(str))
			{
				palList.add(str);
			}
		}
		return palList;
	}
}