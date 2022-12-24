public class Phone {
    //field
    public String owner;

    //Constructor
    public Phone(String owner){
        this.owner = owner;

    }
    //method
    public void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }

}
