package Java12;
public class Monster {
    int hp=50;
    char suffix;
    public Monster (){
        this.suffix=suffix;   
    }
    public void attack(Hero h){
        System.out.println("モンスター"+this.suffix+"の攻撃");
        System.out.println("10のダメージ");
        h.setHp(h.getHp()-10);
    }
}
