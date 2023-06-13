import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через 'enter':");
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        if (num2 == 0){System.out.println("На ноль делить нельзя");
        return;}
        Singleton result = Singleton.getInstance();


        System.out.println(result.Calculator(num1,num2));
    }
}