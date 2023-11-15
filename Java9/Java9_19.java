package Java9;

public class Java9_19 {
    public static void main(String[] args) {
        Hero4 h1=new Hero4();
        Hero4 h2=new Hero4();
        Hero4.money=100;
        //System.out.println(h1.hp);
        System.out.println(Hero4.money); //リスト9-19
        System.out.println(h1.money);
        h1.money=300;
        System.out.println(h2.money);

    }
}
