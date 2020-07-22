import java.util.Arrays;

public class Average {
	public static void main(String[] arg)
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		Adder add=(int[] array,double n)->{return  (Arrays.stream(array).sum())/n;};
		
		System.out.println(add.add(arr,arr.length));
	}

	
	
}
