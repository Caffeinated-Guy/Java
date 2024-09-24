class Car1{
    private String make;
    private String model;
    private int year;
    private String color;
    Car1(String mk, String md, int yr, String clr){  
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.color=clr;}
    public void getCar1Details(){
        System.out.println(color+" "+make+"-"+model+" "+year);}}
public class J8{
    public static void main(String[] args){
        Car1 Ashish = new Car1("BMW","M4 GT3",2022,"M Sports");
        Car1 Kunal = new Car1("Porcshe","911",2020, "GT3 RS");
        System.out.println("The two cars parked in front of nurburgring are");
        Ashish.getCar1Details();
        Kunal.getCar1Details();}}