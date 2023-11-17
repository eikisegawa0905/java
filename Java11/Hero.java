//  リスト11-1

package Java11;

public class Hero{
    String name="ミナト";
    int hp=100;
    //戦う
    public void attack(Monster m){
        System.out.println(this.name+"の攻撃");
        m.hp-=5;
        System.out.println("5ダメージ与えた");
    }
    public final void slip(){   //<finalがついているslip()メソッドは子クラスでオーバーライド禁止
        this.hp-=5;
        System.out.println(this.name+"は転んだ");
        System.out.println("5ダメージ");
    }
    //逃げる
    public void run(){
        System.out.println(this.name+"は逃げ出した");   //runメソッドは子クラスでオーバーライド可能
    }
}