package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.ArgumentFactory;
import pablo.codingame.one_d_spreadsheet.CellRefArgument;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;
import pablo.codingame.one_d_spreadsheet.ValueCell;
import pablo.codingame.one_d_spreadsheet.Cell;

import static org.junit.jupiter.api.Assertions.*;

public class ArgumentFactoryTest {
    @Test
    public void createValueArgument() {
        var sut = new ArgumentFactory(null);
        var result = sut.create("5");
        assertTrue(result instanceof CellValueArgument);
    }

    @Test
    public void createRefArgument() {
        var cells = new Cell[] { new ValueCell() };
        var sut = new ArgumentFactory(cells);
        var result = sut.create("$0");
        assertTrue(result instanceof CellRefArgument);
    }
}
