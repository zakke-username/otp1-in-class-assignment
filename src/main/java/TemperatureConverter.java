public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40.0 || celsius > 50.0;
    }
}
