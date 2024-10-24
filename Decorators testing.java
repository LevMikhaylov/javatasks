package org.example;
public class Main {
    public static void main(String[] args){
        TextProcessor processor = new ReplaceDecorator(
                new UpperCaseDecorator(
                        new TrimDecorator(new SimpleTextProcessor())
                )
        );
        String result = processor.process(" Hello world ");
        System.out.println(result);
    }
}
