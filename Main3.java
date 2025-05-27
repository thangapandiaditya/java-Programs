public class Main3 {
    public static void main(String[] args) {
        Car c=new Car("Rolls Royce",2025,"Red",80000000);
        System.out.println("The name of the model:"+c.getModel());
        System.out.println("Launched year:"+c.getYear());
        System.out.println("The car color:"+c.getColor());
        System.out.println("The price of the car:"+c.getPrice());

        System.out.println("The details about the second car:");
        Car c1=new Car("BMW",2025,"black",6000000);
        System.out.println("The name of the model:"+c1.getModel());
        System.out.println("Launched year:"+c1.getYear());
        System.out.println("The car color:"+c1.getColor());
        System.out.println("The price of the car:"+c1.getPrice());

    }
}
