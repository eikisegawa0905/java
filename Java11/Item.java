package Java11;

public class Item {
    String name;
    int price;
    public Item(String name){ //<引数1つのコンストラクタ
        this.name=name;
        this.price=0;
    }
    public Item(String name,int price){ //<引数２つのコンストラクタ
        this.name=name;
        this.price=price;
    }
}
