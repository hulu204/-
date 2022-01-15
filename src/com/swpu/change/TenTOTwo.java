package com.swpu.change;

/**
 * @author 李聪燕
 * @date 2021/12/8 19:57
 */
public class TenTOTwo {
    public String TenToTwo(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        int a = n;
        int b;
        while (a != 0) {
            char c = '0';
            b = a % 2;
            a = a / 2;
            str.append(b);
        }
        str.reverse();
        return str.toString();
    }
}
