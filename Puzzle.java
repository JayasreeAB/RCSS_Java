import java.util.Scanner;

public class Puzzle {

    static int[][] board = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 0}  // 0 represents the empty space
    };

    // Display the board
    static void displayBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0)
                    System.out.print("_  ");
                else
                    System.out.print(cell + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Locate the empty space (0)
    static int[] findEmpty() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (board[i][j] == 0)
                    return new int[]{i, j};
        return null;
    }

    // Swap tiles
    static void swap(int r1, int c1, int r2, int c2) {
        int temp = board[r1][c1];
        board[r1][c1] = board[r2][c2];
        board[r2][c2] = temp;
    }

    // Move the empty tile in the chosen direction
    static boolean move(char direction) {
        int[] pos = findEmpty();
        int r = pos[0], c = pos[1];

        switch (direction) {
            case 'w': // up
                if (r == 0) return false;
                swap(r, c, r - 1, c);
                return true;

            case 's': // down
                if (r == 3) return false;
                swap(r, c, r + 1, c);
                return true;

            case 'a': // left
                if (c == 0) return false;
                swap(r, c, r, c - 1);
                return true;

            case 'd': // right
                if (c == 3) return false;
                swap(r, c, r, c + 1);
                return true;

            default:
                return false;
        }
    }

    // Check if puzzle is solved
    static boolean isSolved() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 3 && j == 3) return board[i][j] == 0; // empty last
                if (board[i][j] != count++) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 15-PUZZLE GAME ===");
        System.out.println("Controls: w = Up, s = Down, a = Left, d = Right");
        System.out.println("Goal: Arrange tiles in order 1 to 15.\n");

        while (true) {
            displayBoard();

            if (isSolved()) {
                System.out.println("🎉 Congratulations! You solved the puzzle!");
                break;
            }

            System.out.print("Enter move (w/a/s/d): ");
            char move = sc.next().charAt(0);

            if (!move(move)) {
                System.out.println("Invalid move! Try again.");
            }
        }

        sc.close();
    }
}
