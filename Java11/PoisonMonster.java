package Java11;

public class PoisonMonster extends Monster {
    private int PoisonCount=5;
    public PoisonMonster(char suffix){
        super(suffix);
    }
    public void attack(Hero h){
        super.attack(h);
        if(this.PoisonCount>0){
            System.out.println("さらに毒の胞子をばらまいた");
            int dmg=h.getHp() /5;
            h.setHp(h.getHp()-dmg);
            System.out.println(dmg+"ポイントのダメージを与えた");
            this.PoisonCount--;

        }
    }
}
