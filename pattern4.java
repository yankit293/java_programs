import java.io.*;
public class pattern4 {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter row Numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        int k =1;
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }

    }
}
