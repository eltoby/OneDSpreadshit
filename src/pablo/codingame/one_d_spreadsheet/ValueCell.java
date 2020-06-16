package pablo.codingame.one_d_spreadsheet;

public class ValueCell extends Cell {
    @Override
    public Integer calculate() {
        return this.getArg1().getValue();
    }
}
