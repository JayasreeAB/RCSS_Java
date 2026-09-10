public class j40 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);
        sb.delete(6, 12);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
} 
