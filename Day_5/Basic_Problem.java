package Day_5;

public class Basic_Problem {
    
	public static void main(String[] args) {
	     
		double st = 25.0; 
		
		double x = 5.7;
		int num = 20;
		
		int n = 37;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
      System.out.println(count);
      
      AllFactor(n);
      
     boolean yn =  PrimeNumber(n);
     System.out.println(yn);
     
     SumOfNaturalNo(num);
     
     FloorCeil(x);
     
     SQRt(st);
		
	}

	private static void SQRt(double st) {
		
		double sq = Math.sqrt(st);
		
		System.out.println(sq);
		
	}

	private static void FloorCeil(double x) {
		double fl = Math.floor(x);
		double cl = Math.ceil(x);
		
		System.out.println(fl);
		System.out.println(cl);
	}

	private static void SumOfNaturalNo(int num) {
		int sum = 0;
		int i = 1;
		while (i <= num) {
			sum += i;
			i++;
		}
	
		System.out.println(sum);
	}

	private static boolean PrimeNumber(int n) {
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
		
	}

	private static void AllFactor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i +" ");
			}
		}
		
	}
}
