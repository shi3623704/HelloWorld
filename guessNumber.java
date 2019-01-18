import java.util.Scanner;

class GuessNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入你猜测的数字(1~100)");
		
		int number =(int)(Math.random()*100)+1;
		
		while(true){
			int guessNumber =sc.nextInt();
			if(guessNumber>number){
				System.out.println("你猜测的数字偏大");
			}else if(guessNumber<number){
				System.out.println("你猜测的数字偏小");
			}else if(guessNumber==number){
				System.out.println("恭喜你，猜对了");
			}
		}
		
	}
}