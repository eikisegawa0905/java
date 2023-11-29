package Java15;

public class Java15_7 {
    public static void main(String[] args) {
        try{
            //  試験敵に例外を発生させる
            throw new UnsupportedMusicFileException("未対応ファイルです");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
