import java.util.Scanner;
import java.util.Random;
public class Password {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random random = new Random();
String numbers = "0123456789";
String lowercase = "abcdefghijklmnopqrstuvwxyz";
String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?/";
StringBuilder character = new StringBuilder();
System.out.print("Enter the desired password length: ");
int length = sc.nextInt();
System.out.print("Include numbers? (y/n): ");
if (sc.next().equalsIgnoreCase("y")) {
character.append(numbers);
}
System.out.print("Include lowercase letters? (y/n): ");
if (sc.next().equalsIgnoreCase("y")) {
character.append(lowercase);
}
System.out.print("Include uppercase letters? (y/n): ");
if (sc.next().equalsIgnoreCase("y")) {
character.append(uppercase);
}
System.out.print("Include special characters? (y/n): ");
if (sc.next().equalsIgnoreCase("y")) {
character.append(specialChars);
}
if (character.length() == 0) {
System.out.println("Error: No character types selected. Exiting program.");
return;
}
StringBuilder password = new StringBuilder();
for (int i = 0; i < length; i++) {
int index = random.nextInt(character.length());
password.append(character.charAt(index));
}
System.out.println("Generated Password: " + password.toString());
}
}
