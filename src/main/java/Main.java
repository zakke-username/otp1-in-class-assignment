public class Main {
    public static void main(String[] args) {
        TemperatureConverter c =  new TemperatureConverter();
        double celsius = c.fahrenheitToCelsius(100);
        System.out.println(celsius + " c");
    }
}
