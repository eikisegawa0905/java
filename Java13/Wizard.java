package Java13;

public class Wizard extends Character {
    int mp;
    public void attack(Monster m){
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に3ポイントのダメージ");
        m.hp-=3;
    }
    public void fireball(Monster m){
        System.out.println(this.name+"は火の玉を放った");
        System.out.println("敵に20ポイントのダメージ");
        m.hp-=20;
        this.mp-=5;
    }
    public int getHp(){return this.hp;}
    public void setHp(int hp){this.hp=hp;}
}
