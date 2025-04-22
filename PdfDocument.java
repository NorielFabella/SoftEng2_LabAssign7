class PdfDocument implements Document {
    String fileName;
    String author;
    int pageCount;
    String name;

    PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public Document clone() {
        PdfDocument copy = new PdfDocument();
        copy.fileName = this.fileName;
        copy.author = this.author;
        copy.pageCount = this.pageCount;
        copy.name = this.name;
        return copy;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }
}
