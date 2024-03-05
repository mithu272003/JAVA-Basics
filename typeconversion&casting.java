class typeconversionandcasting
{
    public static void main(String [] args)
    {
        int a= 257;
        byte b=127;
        a=b;
        System.out.println(a);
    
    //above is implicite conversion
    
        int c= 257;
        byte d= 127;
        d=(byte)c;
        System.out.println(d);
    
    
        float f=5.6f;
        int e=5;
        e=(int)f;
        System.out.println(e);
    }
    //above is explicite casting
}