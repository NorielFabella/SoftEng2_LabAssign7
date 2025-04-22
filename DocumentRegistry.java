public class DocumentRegistry {
    PdfDocument pdfPrototype;
    TextDocument textDocumentPrototype;
    SpreadsheetDocument spreadsheetPrototype;

    DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount) {
        PdfDocument pdf = (PdfDocument) pdfPrototype.clone();
        pdf.fileName = fileName;
        pdf.author = author;
        pdf.pageCount = pageCount;
        return pdf;
    }

    public TextDocument createText(String encoding, int wordCount) {
        TextDocument text = (TextDocument) textDocumentPrototype.clone();
        text.encoding = encoding;
        text.wordCount = wordCount;
        return text;
    }

    public SpreadsheetDocument createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument sheet = (SpreadsheetDocument) spreadsheetPrototype.clone();
        sheet.spreadsheetName = name;
        sheet.rowCount = rows;
        sheet.columnCount = columns;
        return sheet;
    }
}
