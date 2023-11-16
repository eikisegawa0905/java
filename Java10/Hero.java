package Java10;

public class Hero {
    private int hp;          //リスト10-4
    String name;
    String sword;
    static int money;
    
    public String getName(){
        return this.name;         //<リスト10-9
    }

    public void setName(String name){
        this.name=name;         //リスト10-10
    }
    public void setHp(int hp){
        this.hp=hp;
    }
    void bye(){
        System.out.println("勇者は別れをつげた");
    }
private void die(){         //リスト10-5
    System.out.println(this.name+"勇者は死んでしまった");
    System.out.println("GEAE OVER");
    }
void sleep(){
    this.hp=100;
    System.out.println(this.name+"は、目を覚ました");
    }
public void attack(Monster m) {         //リスト10-6
    System.out.println(this.name+"の攻撃");

    System.out.println("モンスター"+m.suffix+"から2ダメージ受けた");
    this.hp-=2;
    if(this.hp<=0){
        this.die();
        }
    }   
}
