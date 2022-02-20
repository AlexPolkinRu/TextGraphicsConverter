package ru.netology.graphics.image;

public class UnicodeSchema implements TextColorSchema {

    private char[] setSimbols;

    public UnicodeSchema(char... charSet) {
        setSimbols = charSet;
    }

    @Override
    public char convert(int color) {
        double scale = 256.0 / (setSimbols.length - 1);
        int index = (int) Math.round(color / scale);
        return setSimbols[index];
    }
}