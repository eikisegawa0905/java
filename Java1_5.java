//リスト1-4を正しく直した場合

public class Java1_5{
    public static void main( String [] args){
        double tax = 1.08 ;
        int fax = 5 ;
        final double TAX = 1.08 ;
        System.out.println ("5万円から4万円に値下げします");

        fax = 4 ;
        System.out.println ("ＦＡＸの新価格（税込み）");
        System.out.println ( fax * TAX + "万円");
    }
}

