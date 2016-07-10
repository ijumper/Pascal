/**
 * Created by brianmason on 09/07/2016.
 */
public  class PascalTriangle {


    public static int NumberAtPosition(int row, int pos) {

        if (pos <= row ) return pascalAtPosition(row, pos);
        else throw new IllegalArgumentException(String.format("Pascal Triangle does not support row {0} pos {1}", row, pos));
    }

    private static int pascalAtPosition(int row, int pos) {
        int result = 1;

        if ((pos == 1) || (pos == row)) {
            result = 1;
        } else {
            result = pascalAtPosition(row - 1, pos - 1) + pascalAtPosition(row - 1, pos);
        }

        return result;
    }

}
