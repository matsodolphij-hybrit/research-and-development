package com.katas.wordwrap;

import java.util.ArrayList;

class Wrapper {

    public static void main(String[] args) {
        System.out.println(Wrapper.wrap("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", 20));
    }

    public static String wrap(String text, int columnNumber) {
        ArrayList<String> wrappedLines = new ArrayList<String>();
        int cutOff = 0;
        int oldCutOff = 0;

        while(cutOff < text.length() - columnNumber) {
            oldCutOff = cutOff;
            String line = text.substring(cutOff, columnNumber + oldCutOff);
            cutOff = oldCutOff + Wrapper.calculatePositionOfCut(line);
            wrappedLines.add(text.substring(oldCutOff,cutOff));
        }
        wrappedLines.add(text.substring(cutOff, text.length()));

        return String.join("|", wrappedLines);
    }

    public static int calculatePositionOfCut(String text) {
        if(!text.contains(" ")) {
            throw new RuntimeException("Noooooo!!!");
        }
        int length = text.length();
        boolean spaceFound = false;
        while(!spaceFound) {
            spaceFound = text.charAt(length - 1) == ' ';
            length--;
        }
        return length;
    }
}