package com.swpu.change;

/**
 * @author 李聪燕
 * @date 2021/12/8 8:50
 */
public class CharChange {
    char c;
    public CharChange(char c) {
        System.out.println("我的转换");
        this.c = c;
        this.toSixteen();
        this.printReal();
    }
    public void toSixteen() {
        String s = new TwoToSixteen().twoToS(toTwo());
        System.out.println("Hexadecimal : 0x" + s);
    }
    public String toTwo() {
        String s = new TenTOTwo().TenToTwo(c);
        String format = String.format("%08d", Integer.parseInt(s));
        System.out.println("Binary : " + format+"B");
        return format;
    }
    public void printReal() {
        System.out.println("实际数据");
        Bri bri = new Bri();
        bri.charAddress(c);
        bri.charSixteen(c);
    }
}
