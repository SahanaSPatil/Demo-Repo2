class Car{

    String company;
    int model;
    private int reg = 51;

    Car(String company , int model){
        this.company = company;
        this.model = model;

       System.out.println("Created car of " + this.company + " model: " + this.model);
    }

    public void getReg(){
        System.out.println("Registration: " + this.reg);
    }

}

public class Main{
    public static void main(String argv[]){
        System.out.println("Hello World");

        Car swift = new Car("Maruthi", 108);
    }
}
