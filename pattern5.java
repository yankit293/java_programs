import java.io.*;
public class pattern5 {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter row Numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        for(int i=row; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("5");
            }
            System.out.print("\n");
        }

    }
}
