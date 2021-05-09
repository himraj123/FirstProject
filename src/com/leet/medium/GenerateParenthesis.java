package com.leet.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int num){
        List<String> list= new ArrayList<>();

        backtrack("",0,0,num,list);

        return list;
    }

    public static void backtrack(String str,int open,int close,int num,List<String> list){
        if(str.length()==num*2){
            list.add(str);
            return;
        }

        if(open<num){
            backtrack(str+"(",open+1,close,num,list);
        }
        if(close<open){
            backtrack(str+")",open,close+1,num,list);
        }

    }
}
