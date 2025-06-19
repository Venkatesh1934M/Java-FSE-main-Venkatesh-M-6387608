public class Main {
    public static void main(String[] args) {
        DocumentFactory wordfactory=new WordFactory();
        Document worddoc=wordfactory.createDocument();
        worddoc.open();
        DocumentFactory excelfac=new ExcelFactory();
        Document exceldoc=excelfac.createDocument();
        exceldoc.open();
        DocumentFactory PDFfac=new PDFfactory();
        Document pdfdoc=PDFfac.createDocument();
        pdfdoc.open();
    }
}
