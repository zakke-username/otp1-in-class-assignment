import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void fahrenheitToCelsius_convert() {
        TemperatureConverter c = new TemperatureConverter();

        double result1 = c.fahrenheitToCelsius(47.0);
        assertEquals(8.333333, result1, 0.01);

        double result2 = c.fahrenheitToCelsius(-161.78);
        assertEquals(-107.6556, result2, 0.01);

        double result3 = c.fahrenheitToCelsius(0.0);
        assertEquals(-17.77778, result3, 0.01);

        double result4 = c.fahrenheitToCelsius(-40.0);
        assertEquals(-40, result4, 0.01);
    }

    @Test
    void celsiusToFahrenheit_convert() {
        TemperatureConverter c = new TemperatureConverter();

        double result1 = c.celsiusToFahrenheit(12.345);
        assertEquals(54.221, result1, 0.01);

        double result2 = c.celsiusToFahrenheit(-999.0);
        assertEquals(-1766.2, result2, 0.01);

        double result3 = c.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result3, 0.01);

        double result4 = c.celsiusToFahrenheit(-40.0);
        assertEquals(-40, result4, 0.01);
    }

    @Test
    void isExtremeTemperature_test() {
        TemperatureConverter c = new TemperatureConverter();

        assertFalse(c.isExtremeTemperature(12.345));
        assertFalse(c.isExtremeTemperature(-1.2345));
        assertTrue(c.isExtremeTemperature(9999.9));
        assertTrue(c.isExtremeTemperature(-273.1));
    }
}