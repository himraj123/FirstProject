package com.leet.medium;

public class ExcelColumn {
    public static int ColumnNumber(String str){
        // "A" -> 1
        // "AB" -> 28
        int result = 0;
        for(int i=0;i<str.length();i++) {
            result =result*26+(str.charAt(i)-'A'+1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ColumnNumber("ABC"));
    }
}
