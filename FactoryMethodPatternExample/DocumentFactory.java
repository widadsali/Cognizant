public abstract class DocumentFactory {
    
    // The Factory Method: Subclasses will provide the actual implementation
    public abstract Document createDocument();

    // Standard business logic that uses the factory method
    public void processDocument() {
        // The factory doesn't know exactly what type of document it's getting,
        // it just knows it implements the Document interface.
        Document doc = createDocument();
        doc.open();
        doc.save();
        System.out.println("Document processing complete.\n");
    }
}