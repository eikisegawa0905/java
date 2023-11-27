package Java14;

public class Hero {
    String name;
    int hp;
    //  オーバーライド
    public String toString(Hero h){
        return"名前:"+this.name+"HP:"+this.hp;
    }
   
}
