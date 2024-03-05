public class logicaloperatores 
{
    public static void main(String [] args)
    {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        
        boolean result1 = ( a<b && c<d );  // AND operator
        System.out.println(result1); 
        
        boolean result2= ( a>b || c>d);  // OR operator
        System.out.println(result2);

        System.out.println(!result1);  // NOT operator


    }
    
}
