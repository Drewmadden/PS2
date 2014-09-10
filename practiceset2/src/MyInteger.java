
public class MyInteger {
	private int value;
	public MyInteger(int value){
		this.value = value;}
	public int GetValue(){
		return this.value;
		}
	public boolean isEven(){
		return value %2 == 0;}
	public boolean isOdd(){
		return value % 2 != 0;
	}
	public boolean isPrime(){
		 if (value == 1) {
		       return false;}
		   for (int x = 2; x < Math.sqrt(value); x++) {
		       if (value % x == 0) {
		           return false;
		       }   }
		   return true;}
	public static boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int value){
		if (value % 2 != 0){
			return true;		}
		else{
			return false;
		}			}
	public static boolean isPrime(int value){
		 if (value == 1) {
		       return false;
		   }
		   for (int x = 2; x < Math.sqrt(value); x++) {
		       if (value % x == 0) {
		           return false;
		       }
		   }
		   return true;
	}
	private static boolean isEven(MyInteger MyInt){
		return (MyInt.value % 2 == 0);
	}
	private static boolean isOdd(MyInteger MyInt){
		return (MyInt.value % 2 != 0);
	}
	private static boolean isPrime(MyInteger MyInt){
		return MyInt.isPrime(MyInt.GetValue());
	}
	public boolean equals(int num){
		if (num == value){
			return true;}
		else{
			return false;
		}			}
	private boolean equals(MyInteger num){
		if (num.value == value){
			return true;	}
		else{
			return false;
		}			}
	public static int parseInt(char[] c){
		int a  = 0;
		 for (int b = 0 ; b < c.length; b++){
			 a = c[b];
			 a++;
		 } 
		 return a;}
	public static int parseInt(String str){
		return str.length();
	}
}