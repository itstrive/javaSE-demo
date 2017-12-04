public class StringDemo2{
    public static void main (String args[]) {
        System.out.println("A".compareTo("a")); //-32   A < a
        System.out.println("a".compareTo("A")); // 32   a > A
        System.out.println("a".compareTo("a")); // 0    ==
    }
}