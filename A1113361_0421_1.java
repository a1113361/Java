import java.io.*;

public class A1113361_0421_1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        boolean isEM;
        
        do{
            isEM = true;
            System.out.print("請輸入電子郵件信箱:");
            str = br.readLine();

            if(!str.matches("^[a-z]+@[a-z]+\\.[a-z]{2,}$")){
                System.out.println("請輸入正確的電子郵件信箱");
                isEM = false;
            }
        }while(!isEM);
        System.out.println("輸入正確");
    }
}