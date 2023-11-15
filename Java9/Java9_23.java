package Java9;

public class Java9_23 {
    public static void main(String[] args) {
        Hero5.setRandomMoney();
        System.out.println(Hero5.money);        //<ランダムな金額が表示
        Hero5 h1=new Hero5();
        System.out.println(h1.money);           //<同じ金額を表示
    }
}
