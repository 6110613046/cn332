public class Doctor extends Visitor
{

    public Doctor()
    {
    }

    public void visit(Son son)
    {
        double temp = son.readTemperature();
        System.out.println(temp);
        son.takeMedicine();
    
    }
    
    public void visit(Parent p)
    {
        p.takeMedicine();
        double temp = p.readTemperature();
        System.out.println(temp);
    
    }
    
}
