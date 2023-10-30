 // リスト2-15　キーボードから入力を受け付ける命令

public class Java2_15{
    public static void main (String [] args){
        System.out.println("あなたの名前を入力してください。");
        String name = new java.util.Scanner(System.in).nextLine();    //キーボードから入力
        System.out.println("あなたの年齢を入力してください");  
        int age = new java.util.Scanner(System.in).nextInt();         //キーボードから年齢を入力
        System.out.println("ようこそ" + age +"歳の" + name + "さん");
    }
}    

