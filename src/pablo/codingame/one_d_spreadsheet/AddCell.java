package pablo.codingame.one_d_spreadsheet;

public class AddCell extends Cell {
    @Override
    protected Integer calculate() {
        return getArg1().getValue() + getArg2().getValue();
    }
}
