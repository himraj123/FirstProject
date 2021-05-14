package com.leet.medium;

public class Compressor {
    public static void main(String[] args) {
        System.out.println(compressor("aabbbc"));
        System.out.println(deCompress(compressor("aabbbc")));
    }

    public static String compressor(String str){
        StringBuilder sb = new StringBuilder();
        int counter=0;
        for(int i=0;i<str.length();i++){
            counter++;
            if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)){

                if(counter>0) {
                    sb.append(counter);
                }
                sb.append(str.charAt(i));
                counter=0;
            }
        }

        return sb.length() <= str.length() ? sb.toString():str;
    }

    public static String deCompress(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count = str.charAt(i)-'0';
            }
            else{
                while(count>0){
                    sb.append(str.charAt(i));
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
