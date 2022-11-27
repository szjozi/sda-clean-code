package solid.bOpenClosePrinciple.violation;

public class TextTranslator {

    private enum SourceType {
        DB, FILE, DOWNLOAD
    }

    public String translate(SourceType sourceType) {
        String text = getText(sourceType);
        // do translation 
        return "";
    }

    public String getText(SourceType sourceType) {
        switch (sourceType) {
            case DB: {
                return getTextFromDB();
            }
            case FILE: {
                return getTextFromFile();
            }
            case DOWNLOAD: {
                return getTextFromWebService();
            }
        }
        return "";
    }
    
    public String getTextFromDB() {
        // retrieve text from DB
        return "";
    }

    public String getTextFromFile() {
        // read text from file
        return "";
    }

    public String getTextFromWebService() {
        // download text from external provider
        return "";
    }
}