package Java14;
import Java13.*;
import Java13.Character;
public class Hero extends Character {
    public void attack(Monster m){  //<モンスター攻撃用
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10ポイントのダメージを与えた");
        m.hp-=10;       
    }
    public void attack(Goblin g){   //<ゴブリン攻撃用
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10ポイントのダメージを与えた");
        g.hp-=10;
    } 
    public void attack(Slime s){    //<スライム攻撃用
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10ポイントのダメージを与えた");
        s.hp-=10;
    }
    public void attack(DeathBat b){
        System.out.println();
    }
    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
    }
}