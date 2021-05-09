package com.leet.medium;

public class OneEditAway {
    public static void main(String[] args) {
        System.out.println(oneEditAway("hello","helolso"));
    }

    public static boolean oneEditAway(String str1,String str2){
        if(str1.equals(str2)){
            System.out.println("Both string are same");
            return false;
        }

        if(str1.length()==str2.length()){
            return oneEditReplace(str1,str2);
        }
        else if(str1.length()+1==str2.length()){
            return oneEditInsert(str1,str2);
        }
        else if(str2.length()+1==str1.length()){
            return oneEditInsert(str2,str1);
        }
        return false;
    }

    static boolean oneEditReplace(String str1,String str2){ // abbc , abbd
        boolean foundDifference=false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference=true;
            }
        }
        return true;
    }

    static boolean oneEditInsert(String str1,String str2){ // str2 is longer than str1
        int index1=0;
        int index2=0;

        while(index1<str1.length() && index2<str2.length()){
            if(str1.charAt(index1)!=str2.charAt(index2)){
                if(index1!=index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }
}
