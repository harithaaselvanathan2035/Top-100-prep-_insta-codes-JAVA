package arrays;
//remove duplicates
public class array6 {

	public static void main(String[] args) {
		int [] a = {4,7,5,4,2,9,3,2,1};
		//int count = 0;
		for(int i = 0; i<a.length;i++) {
			int j;
			for( j = 0; j<i;j++) {			
				if(a[i] == a[j]) {
					break ;
			}
		}
			if(i == j) {
				System.out.println(a[i]);
			}
	}

	}

}
