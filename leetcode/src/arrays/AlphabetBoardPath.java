package arrays;

public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        StringBuilder stringBuilder = new StringBuilder();
        Coord prev = new Coord(0,0);
        char prevC = 'a';

        for (char c : target.toCharArray()) {
            if (c == 'z' && prevC != 'z' || c != 'z' && prevC == 'z') {
                Coord tmp = getCoord('u'-'a');
                appendVertical(stringBuilder, prev, tmp);
                appendHorizontal(stringBuilder, prev, tmp);
                prev = tmp;
            }

            Coord next = getCoord(c-'a');
            appendVertical(stringBuilder, prev, next);
            appendHorizontal(stringBuilder, prev, next);
            stringBuilder.append("!");
            prev = next;
            prevC = c;
        }

        return stringBuilder.toString();
    }

    private void append(StringBuilder result, int from, int to, char c) {
        result.append(String.valueOf(c).repeat(Math.abs(from - to)));
    }

    private void appendVertical(StringBuilder result, Coord prev, Coord next) {
        char step = prev.row < next.row ? 'D' : 'U';
        append(result, prev.row, next.row, step);
    }

    private void appendHorizontal(StringBuilder result, Coord prev, Coord next) {
        char step = prev.col < next.col ? 'R' : 'L';
        append(result, prev.col, next.col, step);
    }

    private Coord getCoord(int letter) {
        // 4 -> (0,3), 5 -> (1,0)
        // 0 -> (0,0), 7 -> (1,2)
        int row = letter / 5;
        int col = letter % 5;

        return new Coord(row, col);
    }

    record Coord(int row, int col) {}
}
