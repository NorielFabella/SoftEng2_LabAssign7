public class SpreadsheetDocument implements Document {
    String spreadsheetName;
    int rowCount;
    int columnCount;

    SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    @Override
    public Document clone() {
        SpreadsheetDocument copy = new SpreadsheetDocument();
        copy.spreadsheetName = this.spreadsheetName;
        copy.rowCount = this.rowCount;
        copy.columnCount = this.columnCount;
        return copy;
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}
