import java.util.Scanner;

class GuessNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��������²������(1~100)");
		
		int number =(int)(Math.random()*100)+1;
		
		while(true){
			int guessNumber =sc.nextInt();
			if(guessNumber>number){
				System.out.println("��²������ƫ��");
			}else if(guessNumber<number){
				System.out.println("��²������ƫС");
			}else if(guessNumber==number){
				System.out.println("��ϲ�㣬�¶���");
			}
		}
		
	}
}