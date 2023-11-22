package Java12;

public abstract class TangibleAsset extends Asset implements Thing{
    private String color;
    private double weight;
    // コンスラクタ
    public TangibleAsset(String name,int price,String color){
        super(name,price);
        this.color=color;
    }
    //  getter,setterメソッド
    public String getColor(){return this.color;}
    public double getWeight(){return this.weight;}
    public void setWeight(double weight){this.weight=weight;}
}
