import java.util.*;
public class A1113361_0317_1 {
    public static void main(String[] argv) {
  
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入n值:");
        int n = sc.nextInt();
        System.out.print("請輸入m值:");
        int m = sc.nextInt();
        int [][] arr = new int [n][m];

        for (int i = 0; i < n; i++) {
        //i從0+1開始加到(n-1)+1為止
            for (int j = 0; j < m; j++){
                arr[i][j] = (i+1)*(j+1);
                //arr內的(i(=0)+1)*(j(=0)+1)
            }
        }
        
        for(int []p:arr){
        //從arr中取出一個元素存入[]p
            for(int q:p)
            //從p中取出一個元素存入q
                System.out.print(q + "\t");
                System.out.println();
        }
    
    sc.close();
    }
}