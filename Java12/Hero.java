package Java12;

public class Hero extends Character {
    public void attack(Monster m){  //<Characterのattack()メソッドをオーバーライドする or オーバーライドし忘れる
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10ポイントのダメージを与えた");
        m.hp-=10;       
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
    }
}