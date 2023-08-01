package task2;

public class Main {
    public static void main(String[] args) {
        final String parseFileName = "src\\main\\resources\\adress.xml";
        final String saveFileName = "src\\main\\resources\\adress2.xml";
        try {
            SaxParseXML.parseXML(parseFileName);
            SaveXML.createXml(saveFileName);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
