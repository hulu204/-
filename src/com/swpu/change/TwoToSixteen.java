package com.swpu.change;

/**
 * @author 李聪燕
 * @date 2021/12/8 9:53
 */
public class TwoToSixteen {
    public String twoToS(String s) {
        String m;
        String re = "";
        for (int i = 0; i < s.length(); i = i + 4) {
            m = s.substring(i, i+4);
            switch (m) {
                case "0000" :
                    re = re + "0";
                    break;
                case "0001" :
                    re = re + "1";
                    break;
                case "0010" :
                    re = re + "2";
                    break;
                case "0011" :
                    re = re + "3";
                    break;
                case "0100" :
                    re = re + "4";
                    break;
                case "0101" :
                    re = re + "5";
                    break;
                case "0110" :
                    re = re + "6";
                    break;
                case "0111" :
                    re = re + "7";
                    break;
                case "1000" :
                    re = re + "8";
                    break;
                case "1001" :
                    re = re + "9";
                    break;
                case "1010" :
                    re = re + "A";
                    break;
                case "1011" :
                    re = re + "B";
                    break;
                case "1100" :
                    re = re + "C";
                    break;
                case "1101" :
                    re = re + "D";
                    break;
                case "1110" :
                    re = re + "E";
                    break;
                case "1111" :
                    re = re + "F";
                    break;
            }
        }
        return re;
    }
}
