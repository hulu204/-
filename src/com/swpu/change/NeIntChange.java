package com.swpu.change;

/**
 * @author 李聪燕
 * @date 2021/12/8 8:49
 */
public class NeIntChange {
    int i;
    int i0;
    public NeIntChange(String s) {
        System.out.println("我的转换");
        this.i0 = Integer.valueOf(s);
        this.i = Math.abs(i0);
        this.ToSixteen();
        this.printReal();
    }
    public void ToSixteen() {
        System.out.println("Hexadecimal : 0x" + new TwoToSixteen().twoToS(ToTwo()));
    }
    public String ToTwo() {
        String s = new TenTOTwo().TenToTwo(i);
        String format = String.format("%032d", Integer.parseInt(s));
        StringBuilder str = new StringBuilder();
        str.append(format);
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '1') {
                str.setCharAt(j,'0');
            } else {
                str.setCharAt(j,'1');
            }
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == '1') {
                str.setCharAt(j, '0');
            } else {
                str.setCharAt(j, '1');
                break;
            }
        }
        String s_new = str.toString();
        System.out.println("Binary : " + s_new+"B");
        return s_new;
    }
    public void printReal() {
        System.out.println("实际数据");
        Bri bri = new Bri();
        bri.intAddress(i0);
        bri.intSixteen(i0);
    }
}
