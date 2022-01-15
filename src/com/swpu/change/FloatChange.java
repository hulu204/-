package com.swpu.change;

/**
 * @author 李聪燕
 */
public class FloatChange {
    float a;
    public FloatChange(String ins){
        System.out.println("我的转换");
        String re = "";
        // 符号位
        String s = "";
        // 指数位
        String e = "";
        // 尾数位
        String f = "";
        this.a = Float.valueOf(ins);
        float m = Math.abs(a);
        int b = (int)m;
        float c = m - b;

        if (a == 0) {
            re = "00000000";
        }
        // 整数部分转二进制
        String bt = this.iTwo(b);
        // 小数部分转二进制
        String ct = this.fTwo(c);
        // 确定符号位
        if (a > 0) {
            s = "0";
        } else {
            s = "1";
        }

        // 确定指数位和尾数位
        if (bt.length() != 0) {
            // 指数位算法是将整数位转换成1.X*2^M 此处M是整数位长度-1
            e = this.iTwo(bt.length() - 1 + 127);
            // 转换成科学计数法后对小数位进行拼接
            f = bt.substring(1) + ct;
        } else {
            // 整数位为0，只有小数位
            // first统计1第一次出现的位置，可以得到M
            int ie = this.first(ct);
            e = this.iTwo(127 - ie);
            f = ct.substring(ie);
        }
        // 扩到8位指数
        e = String.format("%08d",Integer.parseInt(e));
        // 扩到23位尾数
        while (f.length() < 23) {
            f = f + "0" ;
        }
        re = s + e + f;
        System.out.println("Binary : " + re+"B");
        System.out.println("Hexadecimal : 0x" + this.twoToS(re));
        this.printReal();
    }
    /**
     * 整数部分转成二进制
     */
    public String iTwo(int b) {
        return new TenTOTwo().TenToTwo(b);
    }

    /**
     * 小数部分转二进制
     */
    public String fTwo(float c) {
        String ftwo = "";
        float m = c;
        int n;
        while(m != 0) {
            m = m * 2;
            n = (int) m;
            m = m - n;
            ftwo = ftwo + String.valueOf(n);
        }
        return ftwo;
    }


    /**
     * 统计1第一次出现的位置
     */
    public int first(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * 将二进制转换为十六进制
     */
    public String twoToS(String s) {
        return new TwoToSixteen().twoToS(s);
    }
    public void printReal() {
        System.out.println("实际数据");
        Bri bri = new Bri();
        bri.floatAddress(a);
        bri.floatSixteen(a);
    }
}