import java.io.*;
public class pattern7 {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter row Numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        for(int i=row; i>=0; i--){
            int k=row;
            for(int j=0; j<i; j++){
                System.out.print(k);
                k--;
            }
            System.out.print("\n");
        }

    }
}
