package Java9;

public class Hero3{
    int hp=100;
    String name;


    void attack(){

    }
Hero3 (String name){
    this.hp=100;
    this.name=name;
    }
Hero3(){            //<新しく作ったコンストラクタ②
    //this.hp=100;
    //this.name="ダミー";   <リスト9-12
    this("ダミー");     //<リスト 9-16   
    }
}
