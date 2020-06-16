package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;
import pablo.codingame.one_d_spreadsheet.SubCell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubCellTest {
    @Test
    public void subTest(){
        var sut = new SubCell();
        sut.setArg1(new CellValueArgument(5));
        sut.setArg2(new CellValueArgument(2));
        assertEquals(3, sut.getValue());
    }
}
