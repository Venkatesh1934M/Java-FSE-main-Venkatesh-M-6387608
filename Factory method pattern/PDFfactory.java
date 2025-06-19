public class PDFfactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
    
}
