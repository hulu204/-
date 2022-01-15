package com.swpu.change;

/**
 * @author 李聪燕
 * @date 2021/12/8 9:25
 */
public class PoIntChange {
    int i;
    public PoIntChange(String s) {
        System.out.println("我的转换");
        i = Integer.valueOf(s);
        this.toSixteen();
        this.printReal();
    }
    public void toSixteen() {
        String s = new TwoToSixteen().twoToS(toTwo());
        System.out.println("Hexadecimal : 0x" + s);
    }
    public String toTwo() {
        String s = new TenTOTwo().TenToTwo(i);
        String format = String.format("%032d", Integer.parseInt(s));
        System.out.println("Binary : " + format+"B");
        return format;
    }
    public void printReal() {
        System.out.println("实际数据");
        Bri bri = new Bri();
        bri.intAddress(i);
        bri.intSixteen(i);
    }
}
