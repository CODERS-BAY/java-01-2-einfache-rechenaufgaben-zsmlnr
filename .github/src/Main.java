import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int sumFirst=10;
        int sumSecond=5;

        int sumResult= sumFirst+sumSecond;

        System.out.println(sumFirst+"+"+sumSecond+"="+sumResult);

        int diffFirst=99;
        int diffSecond=50;

        int diffResult= diffFirst-diffSecond;

        System.out.println(diffFirst+"-"+diffSecond+"="+diffResult);

        int prodFirst=25;
        int prodSecond=300;
        double prodThird=6.85;
        double prodFourth=12.3;

        int prodResultFirst=prodFirst*prodSecond;
        double prodResultSecond=prodThird*prodFourth;

        System.out.printf(prodFirst+"*"+prodSecond+"="+prodResultFirst+"\n"+prodThird+"*"+prodFourth+"="+prodResultSecond+"\n");

        double quotFirst=55.25;
        double quotSecond=35.55;

        double quotResult=quotFirst/quotSecond;

        System.out.printf(quotFirst+"/"+quotSecond+"="+"%.2f",quotResult);

    }
}