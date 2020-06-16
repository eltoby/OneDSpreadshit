package pablo.codingame.one_d_spreadsheet;

public class CellValueArgument extends CellArgument {

    private final int value;

    public CellValueArgument(int value) {
        this.value = value;
    }

    @Override
    protected Integer calculate() {
        return value;
    }
}
