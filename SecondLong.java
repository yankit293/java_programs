public class SecondLong {
    public static void main(String args[]) {

        String str = "My name is Ankit";
        String [] words = str.split(" ");
        String longest = null;
        String Secondlong = null;
        for(int i =0 ; i<words.length; i++){
            if(longest.length() < words[i].length())
                longest = words[i];
        }
        for(int i =0 ; i<words.length; i++){
            if(words[i].length() > Secondlong.length() && words[i].length() < longest.length())
                Secondlong = words[i];
        }
        System.out.println(Secondlong);
    }
}
