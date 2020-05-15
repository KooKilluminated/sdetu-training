package basics;

public class Weather {
	public static void main(String[] args) {
		int temp=30;
		if(temp>80) {
			System.out.println("high");
		}
		else if(temp>60){
			System.out.println("moderate");
		}
		else if(temp>20){
			System.out.println("low");
		}
		else {
			System.out.println("freeze");
		}
		
	}
}
