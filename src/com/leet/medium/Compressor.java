package com.leet.medium;

public class Compressor {
    public static void main(String[] args) {
        System.out.println(compressor("abbbc"));
    }

    public static String compressor(String str){
        StringBuilder sb = new StringBuilder();
        int counter=0;
        for(int i=0;i<str.length();i++){
            counter++;
            if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){
                sb.append(str.charAt(i));
                if(counter>1) {
                    sb.append(counter);
                }
                counter=0;
            }
        }

        return sb.length() <= str.length() ? sb.toString():str;
    }
}
