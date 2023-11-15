package Java9;

import java.util.Random;

public class Kadai9 {
   String name;
   int hp;
   
    int mp;
   static final int _MaxHp=50;
   static final int _MaxMp=10;

public Kadai9 (String name,int hp,int mp){
        this.name=name;
        this.hp=hp;
        this.mp=mp;
    }
public Kadai9(String name,int hp){
    this(name,hp,Kadai9._MaxMp);
}
public Kadai9(String name){
    this(name,_MaxHp);
}
public void selfAid(){
    System.out.println(this.name+"はセルフエイドを唱えた");
    this.hp=_MaxHp;
    this.mp-=5;
    System.out.println("HPが全回復した");
    }
public int pray(int sec){
    System.out.println(this.name+"は"+sec+"秒間祈った");

    int recover=new Random().nextInt(3)+sec;

    int recoverActual=Math.min(recover,Kadai9._MaxMp-this.mp);
    return recoverActual;
  
    }

}
