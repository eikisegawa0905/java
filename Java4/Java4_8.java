// 点数管理プログラム（配列版）

public class Java4_8{
    public static void main(String[] args) {
        int [] score ={20,30,40,50,80};
        int sum =
            //score[1]+score[2]+score[3]+score[4]+score[5];       <exception  code
            score[0]+score[1]+score[2]+score[3]+score[4];
        int avg = sum / score.length;
        System.out.println("合計点"+sum);
        System.out.println("平均店"+avg);
    }
}