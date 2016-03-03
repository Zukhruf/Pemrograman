public class Titik {
    //variable
    private int x = 0, y = 0;
    //methods
    public void setXY(int a, int b){
        x = a;
        y = b;
    }
    public double getJarakKeNol(){
        return Math.sqrt(x*x + y*y);
    }
    public void tampilPosisi(){
        System.out.printf("Posisi titik x = %d, y= %d\n",x,y);
    }
    public double getJarakKeTitik(Titik t){
        return Math.sqrt((x-t.x)*(x-t.x)+(y-t.y)*(y-t.y));
    }
}
