//  リスト11-2　11-3 11-5

package Java11;

public class SuperHero extends Hero{    //<基本的には、Heroと同じと宣言
    String name="ミナト"; //<追加した定義
    int hp=100;
    boolean flying;
    //飛ぶ
    public void fly(){
        this.flying=true;
        System.out.println("飛び上がった"); //<追加したfly()
    }
    //着地する
    public void land(){
        this.flying=false;
        System.out.println("着地した"); //<追加したland()
    }
    public void run(){  //<親クラスに定義してあるが、子クラスで再定義(上書き変更)するメソッド
        System.out.println("撤退した");
    }
    public void attack(Monster m){  //<11-8
        //System.out.println(this.name+"の攻撃");
        //m.hp-=5;
        //System.out.println("5ダメージ与えた");  //<1回目の攻撃
        //if(this.flying){
          //  System.out.println(this.name+"の攻撃");
            //m.hp-=5;
            //System.out.println("さらに5ダメージ与えた");    //<2回目の攻撃
        super.attack(m);      
        if (this.flying) {
            super.attack(m);
            
        }    
    }
    
}
