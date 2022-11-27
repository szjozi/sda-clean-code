package solid.bOpenClosePrinciple.solution;

public class TextTranslator {
    
    public String translate(TextProvider textProvider) {
        String text = textProvider.getText();
        // do translation 
        return "Translated text";
    }
}