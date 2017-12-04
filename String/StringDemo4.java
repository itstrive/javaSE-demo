public class StringDemo4{
    public static void main (String args[]) {
        String str = "Strive is a coder";

        System.out.println(initcap(str));
    }

    public static String initcap(String str){
        if(str==null || "".equals(str)){
            return str;
        }
        String result = "";
        String arr[] = str.split(" ");
        for(int i=0; i < arr.length; i++){
            String tmpStr = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);

            result += " " + tmpStr;
        }
        return result.trim();
    }
}