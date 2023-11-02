// リスト4-9　4-10　4-11

public class Java4_11 {
    public static void main(String[] args) {
        int [] score ={20,30,40,50,80};
        
        // 4-9 4-10
        //for(int i =0;i<score.length;i++){
        //    System.err.println(score[i]);

        //4-11
        for(int value:score){
            System.out.println(value);    
        }
    }
}
