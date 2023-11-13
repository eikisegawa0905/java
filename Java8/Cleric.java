//  練習問題8
package Java8;
import java.util.*;

public class Cleric{
    //  練習問題1
    String name ;
    int hp = 50;
    final int _MaxHp=50;
    int mp =10;
    final int _MaxMp=10;
    //  練習問題２

public void selfAid(){
    System.out.println(this.name+"はセルフエイドを唱えた");
    this.hp=_MaxHp;
    this.mp-=5;
    System.out.println("HPが全回復した");
    }// 練習問題３
public int pray(int sec){
    System.out.println(this.name+"は"+sec+"秒間祈った");

    int recover=new Random().nextInt(3)+sec;

    int recoverActual=Math.min(recover,this._MaxMp-this.mp);
    return recoverActual;
    //  練習問題４
    }
}
