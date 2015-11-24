
public class RunTimeError {
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		for (int i = 0; i <= a.length;i++) {
				a[i]*= 2;
				if (i == 5)
					break;
		}
		System.out.println(a[4]);
	}

}
