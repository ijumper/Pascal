/**
 * Created by brianmason on 09/07/2016.
 */
public  class PascalTriangle {

    public static int NumberAtPosition(int row, int pos) {

        if (pos <= row) {
            return 1;
        } else throw new IllegalArgumentException(String.format("Pascal Triangle does not support row {0} pos {1}", row, pos));
    }

}
