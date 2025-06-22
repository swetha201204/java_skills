import java.util.Scanner;
public class TicTacToe {
static char[][] board = new char[3][3];
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
String playAgain;
do {
initialization();
playGame();
System.out.print("Do you want to play again? (yes/no): ");
playAgain = scanner.next();
} 
while (playAgain.equalsIgnoreCase("yes"));
System.out.println("Thanks for playing!");
}
public static void initialization() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
board[i][j] = ' ';
}
}
}
public static void printBoard() {
System.out.println("\n  0   1   2");
for (int i = 0; i < 3; i++) {
System.out.println(" -----------");
System.out.print(i + "|");
for (int j = 0; j < 3; j++) {
System.out.print(" " + board[i][j] + " |");
}
System.out.println();
}
System.out.println(" -----------\n");
}
public static void playGame() {
char currentPlayer = 'X';
boolean gameEnded = false;
while (!gameEnded) {
printBoard();
System.out.println("Player " + currentPlayer + "'s turn:");
int row, col;
while (true) {
System.out.print("Enter row (0, 1, or 2): ");
row = scanner.nextInt();
System.out.print("Enter column (0, 1, or 2): ");
col = scanner.nextInt();
if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
board[row][col] = currentPlayer;
break;
} 
else {
System.out.println("Invalid move! Try again.");
}
}
if (checkWin(currentPlayer)) {
printBoard();
System.out.println("Player " + currentPlayer + " wins!");
gameEnded = true;
} 
else if (isBoardFull()) {
printBoard();
System.out.println("It's a draw!");
gameEnded = true;
} 
else {
currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
}
}
}
public static boolean checkWin(char player) {
for (int i = 0; i < 3; i++) {
if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
return true;
if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
return true;
}
return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
(board[0][2] == player && board[1][1] == player && board[2][0] == player);
}
public static boolean isBoardFull() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if (board[i][j] == ' ')
return false;
}
}
return true;
}
}
