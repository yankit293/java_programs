class StringPalin{
    public static void main(String args[]){
        String str = "lal is a tit for tat";
        String [] words = str.split(" ");
        for(int i =0 ; i<words.length; i++){
            if(checkPalin(words[i]))
                System.out.println(words[i]);     
        }
        
    }
    public static boolean checkPalin(String tmp){
        int len = tmp.length();
        String rev = "";
        for(int i = len-1; i>=0; i--){
            rev += tmp.charAt(i);
        }
        if(rev.equals(tmp))
            return true;
        return false;
    }
}