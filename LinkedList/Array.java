import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 8, 6, 82, 78, 67, 98 };

		int position = 4;

		for (int i = 0; i < a.length - 1; i++) {

			if (i >= position ) {

				a[i] = a[i + 1];
				
				if (i==a.length-2) {
					
					a[i]=a[i+1];
					a[i+1]=0;
				}
			}

			

		}

		System.out.println(Arrays.toString(a));

	}

}
