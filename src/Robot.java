public class Robot {
    //atribut
    private int kecepatan = 0;
    private int arah = 1;
    //metode
    public void tambahKecepatan(int k){
        kecepatan +=k;
    }
    public void setArah(int a){
        if (a!=arah){
            kecepatan = 0; arah = a;
        }
    }
    public void setArahRobotLain(Robot r, int a){
        r.setArah(a);
    }
    public void menari(){
        System.out.println("Hahaha asyik kawan aku robot lagi menari");
    }
    public void tampilRobot(){
        System.out.println("Robot berjalan arah "+arah+" Kecepatan "+kecepatan);
    }
}
