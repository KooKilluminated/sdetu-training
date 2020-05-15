package basics;

public class sumOfNum {
	public static void main(String[] args) {
		int a=5;
		System.out.println(a);
	}
		
	public static int sum(int num) {
		if(num>0) {
		return num+sum(num-1);
		}
		return num;
}
	}
