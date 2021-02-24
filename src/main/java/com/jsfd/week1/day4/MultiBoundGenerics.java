package com.jsfd.week1.day4;

class Bound <T extends A & BillCal> 
{ 
      
    private T objt;
    private float un; 
      
    public Bound(T obj){ 
        this.objt = obj; 
    } 
      
    public void  getBill(float unit){
        this.un = unit;
        this.objt.CalculateEBill(this.un);
    }
}  
  
class A implements BillCal 
{ 

    @Override
    public void CalculateEBill(float unit) {
        
        float units=unit;
	    double billpay=0;
        if(units<100){
            billpay=units*1.20;
        }
        else if(units<300){
            billpay=100*1.20+(units-100)*2;
        }
        else if(units>300){
            billpay=100*1.20+200*2+(units-300)*3;
        }
        System.out.println("Bill to pay : " + billpay);
    }
} 
  
public class MultiBoundGenerics 
{ 
    public static void main(String a[]) 
    {  
        Bound<A> Acal = new Bound<A>(new A()); 
        Acal.getBill(654.25f);
          
    } 
}