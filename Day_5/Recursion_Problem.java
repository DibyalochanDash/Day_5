package Day_5;

public class Recursion_Problem {
	public static void main(String[] args) {
		
		int num = 10;
		  for (int i = 0; i < num; i++) {
	            int res = Febonaci(i);
	            System.out.print(res + " ");
		  }
		  
		  System.out.println();
		  IncreaseNumber(num);
	}

	private static void IncreaseNumber(int num) {
		if (num == 1) {
			System.out.print(1);
			return;
		}

		IncreaseNumber(num - 1);
		
		System.out.print(" "+num);
	
	}

	private static int Febonaci(int num) {
            
		if (num == 0 || num == 1) {
			return num;
		}
        int temp1 = Febonaci(num - 1);
        int temp2 = Febonaci(num - 2);
		
        return temp1 + temp2;
	}

}
