public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document (.pdf) in Read-Only mode...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document... (Exporting)");
    }
}