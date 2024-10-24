package org.example;
class TrimDecorator implements TextProcessor{
    private TextProcessor tp;

    public TrimDecorator(TextProcessor tp) {
        this.tp = tp;
    }

    @Override
    public String process(String text) {
        return tp.process(text).trim();
    }
}
