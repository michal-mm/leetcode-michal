package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AlphabetBoardPathTest {

    private static final char[][] board = {"abcde".toCharArray(),
                                     "fghij".toCharArray(),
                                     "klmno".toCharArray(),
            "pqrst".toCharArray(),
            "uvwxy".toCharArray(),
            "z".toCharArray()
    };

    private String traverse (String commands) {
        StringBuilder result = new StringBuilder();
        int row = 0;
        int col = 0;

        System.out.print("Traversing... ");
        for (char c : commands.toCharArray()) {
            System.out.print(c);
            switch (c){
                case '!' -> result.append(board[row][col]);
                case 'U' -> row--;
                case 'D' -> row++;
                case 'L' -> col--;
                case 'R' -> col++;
                default -> System.out.println("ERROR");
            }
            if (row < 0 || board.length <= row || col < 0 || board[row].length <= col) {
                fail("\n\nIndex out of board for (" + row + "," + col + ") -> you left the board!");
            }
        }
        System.out.println();

        return result.toString();
    }

    @Test
    public void testSpec1() {
        String target = "leet";
        String output = "DDR!UURRR!!DDD!";

        AlphabetBoardPath abp = new AlphabetBoardPath();

        String generated = abp.alphabetBoardPath(target);
        System.out.println(generated);
        assertEquals(output.length(), generated.length());
        assertEquals(traverse(output), traverse((generated)));

    }

    @Test
    public void testSpec2() {
        String target = "code";
        String output = "RR!DDRR!UUL!R!";

        AlphabetBoardPath abp = new AlphabetBoardPath();

        String generated = abp.alphabetBoardPath(target);
        System.out.println(generated);
        assertEquals(output.length(), generated.length());
        assertEquals(traverse(output), traverse((generated)));

    }

    @Test
    public void testSpecZ() {
        String target = "zdz";
        String output = "DDDDD!UUUUURRR!DDDDLLLD!";

        AlphabetBoardPath abp = new AlphabetBoardPath();

        String generated = abp.alphabetBoardPath(target);
        System.out.println(generated);
        assertEquals(output.length(), generated.length());
        assertEquals(traverse(output), traverse((generated)));

    }
}
