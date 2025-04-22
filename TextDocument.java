public class TextDocument implements Document {
    int filePath; 
    String encoding;
    int wordCount;

    TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public Document clone() {
        TextDocument copy = new TextDocument();
        copy.filePath = this.filePath;
        copy.encoding = this.encoding;
        copy.wordCount = this.wordCount;
        return copy;
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: meeting_notes.txt with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: meeting_notes.txt, Encoding: " + encoding + ", Words: " + wordCount);
    }

    @Override
    public String getType() {
        return "Text";
    }
}
