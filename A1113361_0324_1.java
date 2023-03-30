import java.util.*;

class animal{
    String name;
    double height, weight, speed;

    void show(){
        System.out.printf("name: %s, height: %s(公尺), weight: %s(公斤), speed: %s(公尺/分鐘)\n",this.name,this.height,this.weight,this.speed);
    }

    double distance(double x, double y){
        double distan = 0;
        distan = x * y * this.speed;
        return distan;
    }
    double distance(double x){
        double distanc = 0;
        distanc = x * this.speed;
        return distanc;
    }
}

public class A1113361_0324_1 {
    public static void main(String[] args) {

        animal [] ani = new animal[4];
        double [][] situ ={{1.1,52,100},{1.5,99,200},{1.7,48,120},{1.7,50,120}};

        for (int i = 0; i < ani.length; i++){
            ani[i] = new animal();
            ani[i].height = situ[i][0];
            ani[i].weight = situ[i][1];
            ani[i].speed = situ[i][2];
        }

        ani[0].name="雪寶";
        ani[1].name="驢子";
        ani[2].name="安那";
        ani[3].name="愛沙";

        int p = 0;
        while(p < ani.length){
            ani[p].show();
            p++;
        }

        try (Scanner sc = new Scanner(System.in)) {
            double[] x =new double[4];
            double[] y =new double[4];

            for (int i = 0; i < ani.length; i++){
                System.out.printf("請輸入%s總共奔跑的時間(分鐘):", ani[i].name);
                x[i]=sc.nextFloat();
                System.out.printf("僅輸入x(時間)時,%s奔跑的距離為:%f" + "公尺\n\n", ani[i].name, ani[i].distance(x[i]));

                System.out.printf("請輸入%s奔跑時的加速度(公尺/分鐘):", ani[i].name);
                y[i]=sc.nextFloat();

                System.out.printf("%s奔跑的距離為:%f" + "公尺\n\n", ani[i].name, ani[i].distance(x[i],y[i]));
            }
        }
    }
}
