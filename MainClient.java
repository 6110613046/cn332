public class MainClient
{
    public static void main(String args[])
    {
       Visitor v = VisitorFactory.getDrA(); //new DoctorA();
       Son son = FamilyFactory.getSon();//new GrandParent();
       son.accept(v);
       
       Parent p = FamilyFactory.getParent();
       p.accept(v);
       
       
    }


}
