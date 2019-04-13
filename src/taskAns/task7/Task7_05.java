package taskAns.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_05 {
	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		CoinCase cc = new CoinCase();

		for( int i = 0 ; i < 10 ; i++ ) {
			System.out.println( i + "回目" );
			System.out.print( "硬貨の種類は？" );
			String strKindOfCoin = br.readLine();
			System.out.print( "その枚数は？" );
			String strNumOfCoin = br.readLine();
			cc.addCoins( Integer.parseInt( strKindOfCoin ), Integer.parseInt( strNumOfCoin ) );
		}

		System.out.println( "500円硬貨は" + cc.getCount(500) + "枚です。" );
		System.out.println( "100円硬貨は" + cc.getCount(100) + "枚です。" );
		System.out.println( "50円硬貨は" + cc.getCount(50) + "枚です。" );
		System.out.println( "10円硬貨は" + cc.getCount(10) + "枚です。" );
		System.out.println( "5円硬貨は" + cc.getCount(5) + "枚です。" );
		System.out.println( "1円硬貨は" + cc.getCount(1) + "枚です。" );

		System.out.println( "総額は" + cc.getAmount() + "円です。" );
	}
}

class CoinCase {
	private int numOf500;
	private int numOf100;
	private int numOf50;
	private int numOf10;
	private int numOf5;
	private int numOf1;

	public void addCoins( int kindOfCoin, int numOfCoin ) {
		switch( kindOfCoin ) {
			case 500:
				numOf500 += numOfCoin;
				break;
			case 100:
				numOf100 += numOfCoin;
				break;
			case 50:
				numOf50 += numOfCoin;
				break;
			case 10:
				numOf10 += numOfCoin;
				break;
			case 5:
				numOf5 += numOfCoin;
				break;
			case 1:
				numOf1 += numOfCoin;
				break;
			default:
				break;
		}
	}

	public int getCount( int kindOfCoin ) {
		int numOfCount = 0;
		switch( kindOfCoin ) {
			case 500:
				numOfCount = numOf500;
			case 100:
				numOfCount = numOf100;
			case 50:
				numOfCount = numOf50;
			case 10:
				numOfCount = numOf10;
			case 5:
				numOfCount = numOf5;
			case 1:
				numOfCount = numOf1;
			default:
				break;
		}
		return numOfCount;
	}

	public int getAmount() {
		int iAmount = 0;
		iAmount = 500 * numOf500 + 100 * numOf100 + 50 * numOf50
				+ 10 * numOf10 + 5 * numOf5 + 1 * numOf1;

		return iAmount;
	}
}