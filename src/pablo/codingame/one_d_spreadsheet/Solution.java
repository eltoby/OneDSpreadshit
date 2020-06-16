package pablo.codingame.one_d_spreadsheet;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        var params1 = new String[N];
        var params2 = new String[N];
        var cells = new Cell[N];

        var cellsFactory = new CellFactory();
        for (int i = 0; i < N; i++) {
            String operation = in.next();
            cells[i] = cellsFactory.createCell(operation);
            params1[i] = in.next();
            params2[i] = in.next();
        }

        var argsFactory = new ArgumentFactory(cells);

        for (int i = 0; i < N; i++) {
            cells[i].setArg1(argsFactory.create(params1[i]));
            cells[i].setArg2(argsFactory.create(params2[i]));
        }

        for (int i = 0; i < N; i++) {
            System.out.println(cells[i].getValue());
        }
    }
}