package Java14;

public class Account {
    String accountNumber;   //口座番号
    int balance;    //残高
    public String toString(){
        //①
        return"|"+this.balance+"(口座番号＝"+this.accountNumber+")";
    }   //②
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if (o instanceof Account){
            Account a=(Account) o;
            String a1=this.accountNumber.trim();
            String a2=a.accountNumber.trim();
            if(a1.equals(a2)){
                return true;
            }
        }
        return false;
    }
}
