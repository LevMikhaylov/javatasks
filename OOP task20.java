package ru.ithub.javatrain;
import java.util.Scanner;
class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
class Board {
    private char[][] board;
    private final int SIZE = 3;

    public Board() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' '; // Инициализируем пустое поле
            }
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("-----");
            }
        }
    }

    public boolean placeSymbol(int row, int col, char symbol) {
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWinner(char symbol) {
        // Проверка строк, столбцов и диагоналей
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) || // строки
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) { // столбцы
                return true;
            }
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) || // главная диагональ
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol); // побочная диагональ
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private boolean isPlayer1Turn;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.isPlayer1Turn = true; // Ход первого игрока начинается первым
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра начинается! Удачи игрокам!");

        while (true) {
            board.display();
            Player currentPlayer = isPlayer1Turn ? player1 : player2;
            System.out.println(currentPlayer.getName() + ", ваш ход! Введите ряд и столбец (0, 1, или 2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.placeSymbol(row, col, currentPlayer.getSymbol())) {
                if (board.checkWinner(currentPlayer.getSymbol())) {
                    board.display();
                    System.out.println("Поздравляем, " + currentPlayer.getName() + "! Вы выиграли!");
                    break;
                }
                if (board.isFull()) {
                    board.display();
                    System.out.println("Игра закончилась вничью!");
                    break;
                }
                isPlayer1Turn = !isPlayer1Turn; // Меняем очередь игроков
            } else {
                System.out.println("Эта позиция занята! Попробуйте снова.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Player player1 = new Player("Игрок 1", 'X');
        Player player2 = new Player("Игрок 2", 'O');
        Game game = new Game(player1, player2);
        game.start();
    }
}
