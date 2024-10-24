package org.example;

public class ReplaceDecorator implements TextProcessor{
    private TextProcessor tp;

    public ReplaceDecorator(TextProcessor tp) {
        this.tp = tp;
    }

    @Override
    public String process(String text) {
        return tp.process(text).replace(" ","_");
    }
}
