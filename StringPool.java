public class StringPool
{
    @SuppressWarnings("StringEquality")
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = "Hello";
        @SuppressWarnings("RedundantStringConstructorCall")
        String s3 = new String("Hello");
        @SuppressWarnings("RedundantStringConstructorCall")
        String s4 = new String("Hello");
        
        System.out.println("s1==s2"+(s1==s2));
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);

        s3 = s3.intern();
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}