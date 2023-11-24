package Java13;
public class Monster {
    int hp=50;
    char suffix;
    public Monster(char suffix){
        this.suffix=suffix;  
    }
    public Monster() {
    }
    public void attack(Hero h){
        System.out.println("モンスター"+this.suffix+"の攻撃");
        System.out.println("10のダメージ");
        h.setHp(h.getHp()-10);
    }
    public void run() {
    }
}
