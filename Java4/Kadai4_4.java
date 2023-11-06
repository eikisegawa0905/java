// 練習問題4－4

public class Kadai4_4 {
public static void main(String[] args) {
    int[]numbers ={3,4,9};
    System.out.println("1桁目の数字を入力してください");
    int input= new java.util.Scanner(System.in).nextInt();
        for(int a :numbers){
            if(a == input){
                System.out.println("アタリ！");
            }
        }
    }
}
