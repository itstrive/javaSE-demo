public class StringDemo{
    public static void main (String args[]) {
        String str1 = "Strive";
        String str2 = new String("Strive");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2.intern()); //true  //收工入池，变成共享对象
    }
}