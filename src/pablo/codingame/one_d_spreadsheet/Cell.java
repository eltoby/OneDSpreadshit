package pablo.codingame.one_d_spreadsheet;

public abstract class Cell {
    private CellArgument arg1;
    private CellArgument arg2;
    private Integer value;

    public CellArgument getArg1() {
        return arg1;
    }

    public void setArg1(CellArgument arg1) {
        this.arg1 = arg1;
    }

    public CellArgument getArg2() {
        return arg2;
    }

    public void setArg2(CellArgument arg2) {
        this.arg2 = arg2;
    }

    public Integer getValue() {
        if (value == null)
            value = this.calculate();

        return value;
    }

    protected abstract Integer calculate();
}
