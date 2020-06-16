package pablo.codingame.one_d_spreadsheet;

public abstract class CellArgument {
    private Integer value;

    public Integer getValue() {
        if (value == null)
            value = this.calculate();

        return value;
    }

    protected abstract Integer calculate();
}
