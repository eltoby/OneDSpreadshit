package pablo.codingame.one_d_spreadsheet;

public class CellRefArgument extends CellArgument {
    private final Cell cell;

    public CellRefArgument(Cell cell) {
        this.cell = cell;
    }

    @Override
    protected Integer calculate() {
        return this.cell.getValue();
    }
}
