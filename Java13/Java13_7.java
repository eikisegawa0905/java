package Java13;

public class Java13_7 {
    public static void main(String[] args) {
        Character[]c=new Character[5];
        c[0]=new Hero();
        c[1]=new Hero();
        c[2]=new Thief();
        c[3]=new Wizard();
        c[4]=new Wizard();
        //  宿に泊まる
        for(Character ch:c){    //<1名ずつ順に取り出し
            ch.setHp(ch.getHp()+50);
        }

    }
}
