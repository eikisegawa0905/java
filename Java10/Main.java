package Java10;



public class Main {
    public static void main(String[] args) {
        //1.勇者の生成
        Hero h=new Hero();
        //1.1.モンスターの生成
        Monster m1 = new Monster();
        m1.hp=50;
        m1.suffix='A';
        Monster m2 = new Monster();
        m2.hp = 48;
        m2.suffix = 'B';

        //2.フィールドに初期値をセット
        h.name="ミナト";
        h.setHp(100);
        //3.勇者のメソッドを呼び出しておく
    }   
}
