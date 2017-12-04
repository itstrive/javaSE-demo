public class StringDemo3{
    public static void main (String args[]) {
        System.out.println("welcome".contains("lc"));

        System.out.println("welcome".indexOf("e"));
        System.out.println("welcome".indexOf("e",4));
        System.out.println("welcome".lastIndexOf("lc"));

        System.out.println("welcome to china".startsWith("wel"));
        System.out.println("welcome to china".startsWith("com",3));
        System.out.println("welcome to china".endsWith("china"));


        System.out.println("welcome pear".replaceAll("e","__")); //w__lcom__ p__ar
        System.out.println("welcome pear".replaceFirst("e","__")); //w__lcome pear

        System.out.println("welcome".substring(2)); //lcome
        System.out.println("welcome".substring(2,4)); //lc

        String result[]="welcome to china".split(" ");
        for(int x=0; x < result.length; x++){
            System.out.print(result[x]+',');
        }
    }
}