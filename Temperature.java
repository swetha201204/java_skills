import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the temperature value: ");
double temperature = scanner.nextDouble();
System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
char unit = scanner.next().toUpperCase().charAt(0); 
double convertedTemp;
String convertedUnit;
if (unit == 'C') {
convertedTemp = (temperature * 9 / 5) + 32;
convertedUnit = "Fahrenheit";
} 
else if (unit == 'F') {
convertedTemp = (temperature - 32) * 5 / 9;            
convertedUnit = "Celsius";            
} 
else {
System.out.println("Invalid unit entered. Please enter 'C' or 'F'.");
return;
}
System.out.printf("Converted Temperature: %.2f %s%n", convertedTemp, convertedUnit);
    }
}
