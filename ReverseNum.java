package Basic_Core_Prog;

public class ReverseNum {

	public static void main (String []args) {
		
	int num = 12345,reverse = 0;
	while(num != 0) {
		int reminder=num%10;
		reverse=reverse*10+ reminder;
		num=num/10;
	}
	System.out.println("reverse num:"+reverse);
	}
	
}
