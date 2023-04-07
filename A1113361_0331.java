import java.util.*;

public class A1113361_0331 {
    public static void main(String [] argv) {

        animal.showinfo();
    //動物
        animal[] animals = new animal[2];

        animals[0] = new animal("雪寶", 1.1, 52, 100);
        animals[1] = new animal("驢子", 1.5, 99, 200);

        for(int i = 0; i < animals.length; i++){
            animals[i].show();
        }

    //人類
        person[] people = new person[3];

        people[0] = new person("阿克", 1.9, 80, 150, "男");
        people[1] = new person("漢斯", 1.8, 78, 130, "男");
        people[2] = new person("安那", 1.7, 48, 120, "女");

        for(int i = 0; i < people.length; i++){
            people[i].show();
        }
    //女王
        snow queen = new snow("愛沙", 1.7, 50, 120, "女");

        queen.show();


        try (Scanner sc = new Scanner(System.in)){
//動物
            double[] x = new double[2];
            double[] y = new double[2];

            for (int i = 0; i < animals.length; i++){
                System.out.printf("請輸入%s總共奔跑的時間(分鐘): ", animals[i].name);
                x[i] = sc.nextFloat();
                System.out.printf("僅輸入x(時間)時, %s奔跑的距離為:%3.2f" + "公尺\n", animals[i].name, animals[i].distance(x[i]));

                System.out.printf("請輸入%s奔跑時的加速度(公尺/分鐘): ", animals[i].name);
                y[i] = sc.nextFloat();

                System.out.printf("%s奔跑的距離為: %3.2f" + "公尺\n\n", animals[i].name, animals[i].distance(x[i],y[i]));
            }
//人類
            double[] p = new double[3];
            double[] q = new double[3];

            for (int i = 0; i < people.length; i++){
                System.out.printf("請輸入%s總共奔跑的時間(分鐘): ", people[i].name);
                p[i] = sc.nextFloat();
                System.out.printf("僅輸入x(時間)時, %s奔跑的距離為: %3.2f" + "公尺\n", people[i].name, people[i].distance(p[i]));
    
                System.out.printf("請輸入%s奔跑時的加速度(公尺/分鐘): ", people[i].name);
                q[i] = sc.nextFloat();
    
                System.out.printf("%s奔跑的距離為: %3.2f" + "公尺\n\n", people[i].name, people[i].distance(p[i],q[i]));
            }
//女王
            double[] k = new double[3];
            double[] j = new double[3];

            for (int i = 0; i < 1; i++){
                System.out.printf("請輸入%s總共奔跑的時間(分鐘): ", queen.name);
                k[i] = sc.nextFloat();
                System.out.printf("僅輸入x(時間)時, %s奔跑的距離為: %3.2f" + "公尺\n", queen.name, queen.distance(k[i]));

                System.out.printf("請輸入%s奔跑時的加速度(公尺/分鐘): ", queen.name);
                j[i] = sc.nextFloat();

                System.out.printf("%s奔跑的距離為: %3.2f" + "公尺\n", queen.name, queen.distance(k[i],j[i]));
            }
        }
    }
}