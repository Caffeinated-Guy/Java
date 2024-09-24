class Bank2{                    
    int getInterestRate(){
    return 0;}}
class Canara extends Bank2{
    int getInterestRate(){
        return 5;}}
class SBI extends Bank2{          
    int getInterestRate(){        
        return 6;}}
class SCDCC extends Bank2{
    int getInterestRate(){
        return 8;}}
public class J7{
    public static void main(String[] args){
        Canara Canara=new Canara();     
        SBI SBI = new SBI();
        SCDCC SCDCC = new SCDCC();
        System.out.println("Canara Bank: " + Canara.getInterestRate() + " %");
        System.out.println("SBI Bank: " + SBI.getInterestRate() + " %");
        System.out.println("SCDCC Bank: " + SCDCC.getInterestRate() + " %");}}
