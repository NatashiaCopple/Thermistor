/*
 Natashia Copple Lab #2, P.13
 */
package thermistor;
import java.util.*;

public class Thermistor {
//declare permanent variables
    public static final double β = 3969;
    public static final double TZERO = 85;
    public static final double KELVIN = 273;
    public static final double RZERO = 1075;
  
    public static void main(String[] args) {
        // create object to take in user input
        Scanner in = new Scanner(System.in);
        //crate variables
        double resistance, temperature;
        //ask for user input
        System.out.print("Please enter resistence: ");
        //save input to variable
        resistance = in.nextDouble();
        //caculate
        temperature = (( β * TZERO) / ((TZERO *(Math.log(resistance/RZERO)))+ β))- KELVIN;
        //print out
        System.out.format("The temperature is: %.2f°C\n", temperature);
    }
    
}
