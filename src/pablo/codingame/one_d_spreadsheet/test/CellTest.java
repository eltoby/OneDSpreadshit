package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.AddCell;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellTest {

    @Test
    void cellPropertiesTest(){
        var arg1 = new CellValueArgument(1);
        var arg2 = new CellValueArgument(2);
        var cell = new AddCell();
        cell.setArg1(arg1);
        cell.setArg2(arg2);
        assertEquals(arg1, cell.getArg1());
        assertEquals(arg2, cell.getArg2());
    }
}