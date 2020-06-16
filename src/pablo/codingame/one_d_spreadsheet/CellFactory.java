package pablo.codingame.one_d_spreadsheet;

public class CellFactory {
    public Cell createCell(String operation) {
        switch (operation) {
            case "ADD":
                return new AddCell();
            case "SUB":
                return new SubCell();
            case "MULT":
                return new MultCell();
            default:
                return new ValueCell();
        }
    }
}
