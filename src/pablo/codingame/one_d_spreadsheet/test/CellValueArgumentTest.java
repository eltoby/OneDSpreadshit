package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.CellValueArgument;

import static org.junit.jupiter.api.Assertions.*;

public class CellValueArgumentTest {
    @Test
    public void calculateValueArgument(){
        var arg = new CellValueArgument(7);
        assertEquals(7, arg.getValue());
    }
}
