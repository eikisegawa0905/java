package Java10;


public class Rist{
    
    private String name;
    public void setName(String name){
        if(name==null){     //名前にnullが代入そうになった
            throw new IllegalArgumentException("名前がnullである。処理中断");

        }
        if(name.length()<=1){      //短すぎる名前が代入されそうになった
            throw new IllegalArgumentException("名前が短すぎる。処理中断");
        }
        if(name.length()>=8){       //長すぎる名前が代入されそうになった
            throw new IllegalArgumentException("名前が長すぎる。処理中断");
        }
    } 
}
