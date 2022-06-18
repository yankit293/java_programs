class stringprime{
    public static void main(String args[]){
        String str = "They are foolish people";
        String [] words = str.split(" ");
        for(int i =0 ; i<words.length; i++){
            if(checkPrime(words[i].length()))
                System.out.println(words[i]);     
        }
        
    }
    public static boolean checkPrime(int n){
        int i;
        for(i = 2 ; i<=n; i++){
            if(n%i == 0)
                break;
        }
        if(n == i)
            return true;
        return false;
    }
}