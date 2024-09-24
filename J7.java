class Car{
    public void type(){
        System.out.println("Type of Tpes");}}
class German extends Car{
    public void type(){                
        System.out.println("German");}}
class Japanese extends Car{
    public void type(){
        System.out.println("Japanese");}}
public class J7{
    public static void main(String[] args){
        Car manufacture=new Car();
        German Mercedes =new German();
        Japanese Nissan=new Japanese();
        Car dinesh = new Japanese();  
        manufacture.type();
        Mercedes.type();
        Nissan.type();
        dinesh.type();}
}