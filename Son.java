public class Son
{
    
    public Son()
    {

    }

    public double readTemperature(){
        return 36.8;
    }
    
    public void takeMedicine(){
        System.out.println("Take a pill.");
    }
    
    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
