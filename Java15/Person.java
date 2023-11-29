package Java15;

public class Person {
    int age;
    public void setAge(int age){
        if(age<0){  //引数チェック
            throw new IllegalArgumentException("年齢は正の数を指定すべき 指定値＝"+age);


        }
        this.age=age;   //問題ないなら、フィールド値にセット
    }
}
