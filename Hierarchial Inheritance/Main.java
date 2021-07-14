import java.util.Scanner;
class Bike{
    private String color;
    private String name;
    private Float cc;
    private Integer speed;
    private Double price;
    private int weight;
    
    
    
    //GETTERS
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public float getCC(){
        return cc;
    }
    public int getSpeed(){
        return speed;
    }
    public Double getPrice(){
        return price;
    }
    public int getWeight(){
        return weight;
    }
    //SETTER
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setCC(float cc){
        this.cc=cc;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
}
class Sportbike extends Bike{
    private int discount;
    private double price1;
    
    public Sportbike(String name, String color, Float cc, Integer speed, Double price, int discount){
        super.setName(name);
        super.setColor(color);
        super.setCC(cc);
        this.price1=price;
        this.discount=discount;
        super.setSpeed(speed);
        super.setPrice(price-discount);
        
    }
    public int getDiscount(){
        return discount;
    }
    public double getPrice1(){
        return price1;
    }
    public String toString()
    {
        return "Name : "+super.getName()+"\nColor : "+super.getColor()+"\nCapacity : "+super.getCC()+"\nSpeed : "+super.getSpeed()+"\nPrice : "+getPrice1()+"\nManufacturer Discount : "+getDiscount()+"\nSports Bike price is "+super.getPrice();
    }
    
    
}
class Scooter extends Bike{
    private int discount;
    private double price1;
    private int weight;
    public Scooter(String name, String color, Float cc, Integer speed, Double price, Integer weight,int discount) {
        super.setName(name);
        super.setColor(color);
        super.setCC(cc);
        super.setSpeed(speed);
        this.price1=price;
        this.discount=discount;
        this.weight=weight;
        super.setPrice(price-discount);
        super.setWeight(weight);
    }
    
    public int getDiscount(){
        return discount;
    }
    public double getPrice1(){
        return price1;
    }
    public int getWeight(){
        return weight;
    }
    public String toString()
    {
        return "Name : "+super.getName()+"\nColor : "+super.getColor()+"\nCapacity : "+super.getCC()+"\nSpeed : "+super.getSpeed()+"\nPrice : "+getPrice1()+"\nWeight : "+getWeight()+"\nManufacturer Discount : "+getDiscount()+"\nScooter price is "+super.getPrice();
    }
}

class Main{
    public static void main(String args[]){
        String name;
        String color;
        float cc;
        int speed;
        double price;
        int manufacturerDiscount;
        int weight;
        
        
        //
        System.out.println("Enter the details of Sports Bike");
        Scanner scan=new Scanner(System.in);
        System.out.println("Name of the bike :");
        name=scan.next();
        System.out.println("Color of the bike :");
        color=scan.next();
        System.out.println("Capacity(cc) of the bike :");
        cc=scan.nextFloat();
        System.out.println("Speed of the bike :");
        speed=scan.nextInt();
        System.out.println("Price of the bike :");
        price=scan.nextDouble();
        System.out.println("Discount of the bike :");
        manufacturerDiscount=scan.nextInt();
        Sportbike qwert=new Sportbike(name,color,cc,speed,price,manufacturerDiscount);
        
        //
        System.out.println("Enter the details of Scooter");
        System.out.println("Name of the Scooter");
        name=scan.next();
        System.out.println("Color of the Scooter :");
        color=scan.next();
        System.out.println("Capacity(CC) of the Scooter :");
        cc=scan.nextFloat();
        System.out.println("Speed of the Scooter :");
        speed=scan.nextInt();
        System.out.println("Price of the Scooter :");
        price=scan.nextDouble();
        System.out.println("Discount of the scooter :");
        manufacturerDiscount=scan.nextInt();
        System.out.println("Weight of the scooter :");
        weight=scan.nextInt();
        Scooter yuio =new Scooter(name,color,cc,speed,price,weight,manufacturerDiscount);
        
        System.out.println("Sports Bike :");
        System.out.println(qwert.toString());
        System.out.println("Scooter :");
        System.out.println(yuio.toString());
    }
}