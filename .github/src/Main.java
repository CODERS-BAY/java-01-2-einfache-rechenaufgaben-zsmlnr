import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int sumFirst = 10;
        int sumSecond = 5;
        int sumThird = 15;
        int sumFourth = 20;

        int sumResultFirst = sumFirst + sumSecond;
        int sumResultSecond = sumThird + sumFourth;

        System.out.println(sumFirst + "+" + sumSecond + "=" + sumResultFirst);
        System.out.printf("%d + %d = %d", sumThird, sumFourth, sumResultSecond);

        int diffFirst = 99;
        int diffSecond = 50;
        int diffThird = 22;
        int diffFourth = 32;

        int diffResult = diffFirst - diffSecond;
        int diffResultSecond = diffThird - diffFourth;

        System.out.println(diffFirst + "-" + diffSecond + "=" + diffResult);
        System.out.printf("%d - %d = %d", diffThird, diffFourth, diffResultSecond);

        int prodFirst = 25;
        int prodSecond = 300;
        double prodThird = 6.85;
        double prodFourth = 12.3;

        int prodResultFirst = prodFirst * prodSecond;
        double prodResultSecond = prodThird * prodFourth;

        System.out.printf("%d * %d = %d \n", prodFirst, prodSecond, prodResultFirst);
        System.out.printf("%.2f * %.2f = %.2f \n", prodThird, prodFourth, prodResultSecond);

        double quotFirst = 55.25;
        double quotSecond = 35.55;

        double quotResult = quotFirst / quotSecond;

        System.out.printf("%.2f / %.2f = %.2f", quotFirst, quotSecond, quotResult);

    }
}