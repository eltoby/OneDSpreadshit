package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;
import pablo.codingame.one_d_spreadsheet.ValueCell;

import static org.junit.jupiter.api.Assertions.*;

public class ValueCellTest {
    @Test
    public void calculateValueCell(){
        var cell = new ValueCell();
        cell.setArg1(new CellValueArgument(3));
        assertEquals(3, cell.calculate());
    }
}
