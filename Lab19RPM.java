import java.util.Scanner;

class ExpressionSingleton {
    private int x;
    private int y;

    private static ExpressionSingleton instance = null;

    private ExpressionSingleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ExpressionSingleton getInstance() {
        if (instance == null) {
            instance = new ExpressionSingleton(0, 0);
        }
        return instance;
    }

    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double evaluate() {
        return 2 * x + 3.0 / y;
    }
}
    public class Lab19RPM  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение x: ");
            int x = scanner.nextInt();
            System.out.print("Введите значение y: ");
            int y = scanner.nextInt();
            
            ExpressionSingleton expr = ExpressionSingleton.getInstance();
            expr.setValues(x, y);
            double result = expr.evaluate();
            System.out.println(result);
            
            

            
        }
}