class Car{

    String company;
    int model;

    Car(String company , int model){
        this.company = company;
        this.model = model;

       System.out.println("Created car of " + this.company + " model: " + this.model);
    }

}

public class Main{
    public static void main(String argv[]){
        System.out.println("Hello World");

        Car swift = new Car("Maruthi", 108);
    }
}