public class animal{

    public static  void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統\n");
    }

    String name;
    double height, weight, speed;
//動物
    animal(String name,double height,double weight,double speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    void show(){
        System.out.printf("name: %s\theight: %3.2f(公尺)\tweight: %3.2f(公斤)\tspeed: %3.2f(公尺/分鐘)\n",this.name,this.height,this.weight,this.speed);
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
//人類
class person extends animal{
    String gender;
    person(String name, double height, double weight, double speed, String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }
    void show(){
        System.out.printf("name: %s\theight: %3.2f(公尺)\tweight: %3.2f(公斤)\tspeed: %3.2f(公尺/分鐘)\tgender: %s\n", this.name, this.height, this.weight, this.speed, this.gender);
    }
}
//女王
class snow extends person{
    snow(String name,double height,double weight,double speed,String gender){
        super(name, height, weight, speed, gender);
    }

    void show(){
        System.out.printf("name: %s\theight: %3.2f(公尺)\tweight: %3.2f(公斤)\tspeed: %3.2f(公尺/分鐘)\tgender: %s\t", name, height, weight, speed, gender);
        System.out.printf("freezskill: Yes\n");
    }
    double distance(double x, double y){
        double distan = 0;
        distan = x * y * speed * 2;
        return distan;
    }
    double distance(double x){
        double distan = 0;
        distan = x * speed * 2;
        return distan;
    }
}
