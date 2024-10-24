package org.example;
class UpperCaseDecorator implements TextProcessor{
    private TextProcessor tp;

    public UpperCaseDecorator(TextProcessor tp) {
        this.tp = tp;
    }

    @Override
    public String process(String text) {
        return tp.process(text).toUpperCase();
    }
}
