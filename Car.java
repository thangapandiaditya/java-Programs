public class Car {
    private String model;
    private int year;
    private String color;
    private int price;
    public Car(String model, int year, String color, int price){
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
    }
    public String getModel(){
        return model;

    }
    public int getYear(){
        return year;

    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }



}
