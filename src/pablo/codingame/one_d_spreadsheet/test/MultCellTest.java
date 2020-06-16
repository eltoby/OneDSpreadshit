package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;
import pablo.codingame.one_d_spreadsheet.MultCell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultCellTest {
    @Test
    public void multTest(){
        var sut = new MultCell();
        sut.setArg1(new CellValueArgument(3));
        sut.setArg2(new CellValueArgument(4));
        assertEquals(12, sut.getValue());
    }
}
