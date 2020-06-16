package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.CellRefArgument;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;
import pablo.codingame.one_d_spreadsheet.ValueCell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellRefArgumentTest {
    @Test
    public void calculateReferenceArgument() {
        var cell = new ValueCell();
        cell.setArg1(new CellValueArgument(3));
        var sut = new CellRefArgument(cell);
        assertEquals(3, sut.getValue());
    }
}
