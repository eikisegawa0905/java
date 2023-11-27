package Java14;

public class Hero {
    String name;
    int hp;
    //  オーバーライド
   public boolean equals(Object o){
    if(this==o){return true;}
    if(o instanceof Hero){
        Hero h= (Hero)o;
        if(this.name.equals(h.name)){
            return true;
        }
    }
    return false;
   }
}
