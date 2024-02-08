package SimpleClasses;

public class CoinProgram {
    
    public static void main(String[] args) {
        
        Coin myCoin = new Coin("tails");

        System.out.println(myCoin.getSideUp());
        myCoin.toss();
        System.out.println(myCoin.getSideUp());

        Coin coin2 = new Coin();
    }
}
