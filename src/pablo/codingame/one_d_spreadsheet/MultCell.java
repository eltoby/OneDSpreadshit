package pablo.codingame.one_d_spreadsheet;

public class MultCell extends Cell {
    @Override
    protected Integer calculate() {
        return this.getArg1().getValue() * this.getArg2().getValue();
    }
}
