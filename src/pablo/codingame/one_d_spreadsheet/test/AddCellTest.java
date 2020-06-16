package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.AddCell;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddCellTest {
    @Test
    public void addTest() {
        var sut = new AddCell();
        sut.setArg1(new CellValueArgument(1));
        sut.setArg2(new CellValueArgument(2));
        assertEquals(3, sut.getValue());
    }
}
