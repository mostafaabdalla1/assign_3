
package bonus;


public class MemberProducer {
    public static AbstractMember GetDepartement (String Department  )
    {
        if(Department.toUpperCase()==null)
            return null;
        else switch(Department.toUpperCase()) {
		case"CS":return new MemeberFactoryCS() ;
		case"IS":return new MemberFactoryIS();
                default:return null;
		
        
                }
        
    }
}