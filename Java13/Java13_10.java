package Java13;

public class Java13_10 {
    public static void main(String[] args) {
        Monster[] monsters=new Monster[3];
        monsters[0]=new Slime();
        monsters[1]=new Goblin();
        monsters[2]=new DeathBat();
        for(Monster m:monsters){
            m.run();
        }
    }   
}
