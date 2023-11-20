//  リスト11-1

package Java11;

public class Hero{
    private String name="ミナト";
    private int hp=100;
    public int getHp(){return this.hp;}
    public void setHp(int hp){this.hp=hp;}          
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