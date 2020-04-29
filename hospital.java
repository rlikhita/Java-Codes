import java.util.*;
class medicines
{
    private String name;
    private String manu;
    private String expiry;
    private float rate;
    private int total;
    private String supplier;
    private int reorder;
    private int max;
    private int min;
    private int order;
    
    medicines()
    {
        name ="xyz";
        manu = "01.01.2019";
        expiry = "12.12.2020";
        rate = 40;
        total = 500;
        supplier = "reddy labs";
        reorder = 100;
        max = 500;
        min = 50; 
        order = 0;
        
    }
    
    medicines (String a,String b,String c,float d,int e,String f,int g,int h,int i,int j)
    {
        name= a;
        manu=b;
        expiry=c;
        rate=d;
        total=e;
        supplier=f;
        reorder=g;
        max=h;
        min=i;
	order=j;
    }
    
    
    
    public void supply(int a)
            {
                total= total - order;
                if(total<reorder)
                {
                     placeorder();
                    
                }
              
            }
    
    public void placeorder()
    {
        System.out.print("Order for medicines is placed");
    }
    
  

    
}
public class hospital {

    public static void main(String[] args) 
{
        medicines S1 = new medicines( "Likhita","20.10.2018","20.10.2019",20,100,"Reddy Labs",100,500,50,10);
        S1.supply(10);
       	
		//System.out.println("Total quantity of medinices available is" +total);
    
		
    }
    
}