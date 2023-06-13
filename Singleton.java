public class Singleton {
private static Singleton instance;
private Singleton(){}
public static Singleton getInstance(){
    if (instance==null){
        instance = new Singleton();}
    return instance;
}
    public double Calculator(double x, double y) {
        return 2 * x + 3 / y;
    }
}