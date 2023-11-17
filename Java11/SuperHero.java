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
}