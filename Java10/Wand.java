//  練習問題10

package Java10;

public class Wand {
    private String name;        //杖の名前
    private double power;       //杖の魔力    
    //  練習問題10-1

public String getName(){return this.name;}
public void setName(String name){
    if(name==null||name.length()<3){         //杖の名前がnullであってはならず、3文字以上
        throw new IllegalArgumentException("不適切なワードが含まれていたため設定出来ません");
    }       //魔法使いのMPは0以上である
this.name=name;
}

public double getPower(){return this.power;}
public void setPower(double power){
    if(power<0.5||power>100){           //杖の魔力による増減率は0.5<魔力<100
        throw new IllegalArgumentException("設定している魔力値が異常です。");
    }
this.power=power;
}
    //練習問題10-2 10-3
}

