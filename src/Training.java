
public class Training {

    public static void main(String[] args) {
        double fahrenheit = 212.0;
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        double inch = 1000;
        double meters = inch * 0.0254;
        System.out.println("1000.0 inch is " + meters + " meters");


        int inputMin = 3456789;
        int dayResult = inputMin / 1440;
        int yearResult = dayResult / 365;
        int sss = dayResult % 365;


        System.out.println(yearResult + " years and " + sss + " days");

        double height = 72 * 0.0254;
        double weight = 452 * 0.45359237;
        double s = Math.pow (height, 2);
        double bmi =  weight / s;
        System.out.println(bmi);
    }
}
