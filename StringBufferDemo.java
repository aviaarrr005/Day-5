public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        sb.append(" World");
        
        sb.insert(6, "Modern ");
        
        sb.replace(13, 17, "Universe");
        
        sb.delete(5, 12);
        
        sb.reverse();
        
        String result = sb.toString();

        System.out.println("Final Result: " + result);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }
}