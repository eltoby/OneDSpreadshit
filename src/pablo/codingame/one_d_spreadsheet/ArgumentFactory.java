package pablo.codingame.one_d_spreadsheet;

public class ArgumentFactory {
    private final Cell[] cells;

    public ArgumentFactory(Cell[] cells) {

        this.cells = cells;
    }

    public CellArgument create(String arg) {
        if (arg.startsWith("$"))
            return createCellRefArgument(arg);
        else if (arg.equals("_"))
            return null;
        else
            return createCellValueArgument(arg);
    }

    private CellValueArgument createCellValueArgument(String arg) {
        return new CellValueArgument(Integer.parseInt(arg));
    }

    private CellArgument createCellRefArgument(String arg) {
        var pos = Integer.parseInt(arg.substring(1));
        var cell = this.cells[pos];
        return new CellRefArgument(cell);
    }
}
