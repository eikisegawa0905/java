package Java12;

public class Book{
    private String name;
    private int price;
    private String color;
    private String isbn;
    //　コンストラクタ
    public Book
        (String name,int price,String color,String isbn){
            this.name=name;
            this.price=price;
            this.color=color;
            this.isbn=isbn;
        }
    //  getter メソッド
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
    public String getColor(){return this.color;}
    public String grtIsbn(){return this.isbn;}

}
