package com.swpu.change;

import java.util.Scanner;

/**
 * @author 李聪燕
 * @date 2021/12/8 8:50
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = s.charAt(0);
        char MIN = 'A';
        char MAX = 'z';
        if (s.indexOf(".") != -1) {
            new FloatChange(s);
        }else if (c == '-') {
            new NeIntChange(s);
        } else if (c >= MIN && c <= MAX) {
            new CharChange(c);
        } else if (Character.isDigit(c)) {
            new PoIntChange(s);
        }

    }
}
