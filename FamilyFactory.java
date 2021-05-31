public class FamilyFactory
{
    public static Son getSon(){
        return new Son();
    }
    
    public static Parent getParent(){
        return new Parent();
    }
}
