package tw.org.iii.java.Chuan;

public class Poker {

	public static void main(String[] args) {
		//洗牌
		int[]Poker = new int [52];
		for(int i=0; i<Poker.length; i++){
		int temp ;
			//System.out.println(temp);
			
		//檢查機制
		boolean isRepeat; 
		do{
			temp=(int)(Math.random()*52);
			isRepeat = false;
				for(int j=0; j<i; j++){
					if(temp == Poker[i] ){
						isRepeat = true;
							break;
					}
				}
			}while(isRepeat);
			Poker[i]=temp;
		}
		//發牌
		int[][]player = new int[4][13];
		for(int i=0; i<player.length; i++){
			player[i%4][i/4]= Poker[i];
		}
	}
}
