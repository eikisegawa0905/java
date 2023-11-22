package Java13;

public class Java13_3 {
    public static void main(String[] args) {
        Wizard w=new Wizard();
        Character c=w;  //<Character型の箱に代入
        Monster m=new Monster();
        c.name=("アサカ");
        c.attack(m);
        //c.fireball(m);  <箱の中身がわからなくっている
        w.fireball(m);
    }
}    