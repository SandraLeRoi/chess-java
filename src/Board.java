import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    protected int[][] echiquier;
    protected int x,y;

    public Board() {
        // J'aimerais faire un tableau ou A1 = 11, A2=22 ....
        //ou x va de 1 à 8 et y de 1 à 8
        echiquier = new int[8][8];
        for (int i = 1; i < echiquier.length; i++) {
            for (int j = 1; j < echiquier[i].length; j++) {
                x= i;
                y = j;
                echiquier[i][j] = x+y;
            }
        }
        System.out.println(echiquier[x][y] + " ");
    }

    @Override
    public String toString() {
        return Arrays.toString(echiquier);
    }
}
