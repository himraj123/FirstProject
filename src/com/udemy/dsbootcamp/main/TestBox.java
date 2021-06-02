package com.udemy.dsbootcamp.main;


public class TestBox {
    public boolean backspaceCompare(String s, String t) {
        System.out.println(build(s));
        return build(s).equals(build(t));
    }

    public String build(String str) {
        Stack<Character> ans = new Stack<Character>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                ans.push(c);
            } else {
                if (ans.size!=0) {
                    ans.pop();
                }
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        System.out.println(new TestBox().backspaceCompare("ac#","abd#"));
    }
}
