public class FactoryTest {

    public static void main(String[] args) {
        System.out.println("--- Document Management System --- \n");

        // 1. Create a Word Document using its Factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();

        // 2. Create a PDF Document using its Factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument();

        // 3. Create an Excel Document using its Factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();
    }
}