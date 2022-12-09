package day26_statics;

public class IPhone {

    public static String brand = "Apple"; // static: Apple is the brand of all the IPhone object's

    public String model; // instance(anlIk dEGISKEN) different models for IPhone objects

    public String color;

    public double price;

    public static String Os = "IOS"; // static: operating system is same from all the IPhone objects

    public static String madeIn = "China"; // static:

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;


    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;

    }



    public void printPhoneInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

    }


    public static void printPhoneOperatingSystem() {
        System.out.println("Operating System: " + Os);
    }
}





/*
Attributes:
Brand,model,color,price,OS,madeIn,hasBattery,isTouchScreen,isExpensiveToFix
 */
