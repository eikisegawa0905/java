//  練習問題10

package Java10;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
public void heal(Hero h){
    //  練習問題10-1
    int basepoint=10;           //基本回復ポイント
    int recovPoint=(int)(basepoint*this.getWand().getPower());            //杖による増幅

    h.setHp(this.getHp()+recovPoint);
    System.out.println(h.getName()+"のHPを"+recovPoint+"回復した");
    }
public int getHp(){return this.hp;}
public void setHp(int hp){
    if(hp<0){this.hp=0;}
    else{this.hp=hp;}
}       //  魔法使いのHPは0以上であり、0を下回る値が設定されそうになると代わりに0が代入される
public int getMp(){return this.mp;}
public void setMp(int mp){
    if(mp<0){
        throw new IllegalArgumentException("設定しているMPが異常です");
    }       //魔法使いのMPは0以上である
    this.mp=mp;
}

public String getName(){return this.name;}
public void setName(String name){
    if(name==null||name.length()>3){
        throw new IllegalArgumentException("不適切なワードが検出されたため設定できません。");
    }       //  魔法使いの名前がnullでなく、3文字以上
    this.name=name;
}

public Wand getWand(){return this.wand;}
public void setWand(Wand wand){this.wand=wand;}
    //練習問題10-2

}