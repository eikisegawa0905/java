package Java9;

public class Java9_12{
    public static void main(String[] args) {
        Hero3 h1=new Hero3("ミナト");


        System.out.println(h1.name);
        Hero3 h2=new Hero3();   //<引数がないのでコンストラクタ②が呼び出される

        System.out.println(h2.name);        //<ダミーと表示される
    }
    
}
