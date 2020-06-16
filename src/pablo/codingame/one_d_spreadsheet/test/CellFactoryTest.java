package pablo.codingame.one_d_spreadsheet.test;

import org.junit.jupiter.api.Test;
import pablo.codingame.one_d_spreadsheet.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellFactoryTest {
    @Test
    public void createValueCell() {
        var sut = new CellFactory();
        var result = sut.createCell("VALUE");
        assertTrue(result instanceof ValueCell);
    }

    @Test
    public void createAddCell() {
        var sut = new CellFactory();
        var result = sut.createCell("ADD");
        assertTrue(result instanceof AddCell);
    }

    @Test
    public void createSubCell() {
        var sut = new CellFactory();
        var result = sut.createCell("SUB");
        assertTrue(result instanceof SubCell);
    }

    @Test
    public void createMultCell() {
        var sut = new CellFactory();
        var result = sut.createCell("MULT");
        assertTrue(result instanceof MultCell);
    }
}
