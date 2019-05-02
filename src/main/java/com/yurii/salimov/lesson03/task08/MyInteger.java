package com.yurii.salimov.lesson03.task08;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MyInteger {

    public static int parseInt(final String text) throws ParseIntException {
        int num = 0;
        final int start = (text.charAt(0) == '+') || (text.charAt(0) == '-') ? 1 : 0;
        for (int i = start; i < text.length(); i++) {
            int ch = Character.digit(text.charAt(i), 10);
            if (ch == -1) {
                throw new ParseIntException("Error converting - " + text);
            }
            num += ch * Math.pow(10, text.length() - 1 - i);
        }
        return (text.charAt(0) == '-') ? (-1 * num) : num;
    }
}
