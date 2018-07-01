package com.example.linxingguang.myapplication;

public class StringUtils {

    public static boolean IsBrother(String strA, String strT) {

        boolean isBrother = true;
        if (strA.length() != strT.length()) {
            isBrother = false;
        }
        char[] charsA = strA.toCharArray();
        char[] charsT = strT.toCharArray();
        quickShort(charsA, 0, charsA.length-1);
        quickShort(charsT, 0, charsA.length-1);

        int i = 0;
        int n = charsA.length;
        while (n-- != 0) {
            if (charsA[i] != charsT[i]) {
                isBrother = false;
                break;
            }
            i++;
        }
        return isBrother;
    }

    /**
     * 给字符串排序 快排
     * @param chars
     * @param start
     * @param end
     */
    public static void quickShort(char[] chars, int start, int end) {
        if (start < end) {
            char base = chars[start];//选定一个基准值（第一个数为基准值）
            char temp;//记录临时中间值
            int i = start, j = end;
            do {

                while (chars[i] < base && i < end) {
                    i++;
                }
                while (chars[j] > base && j > start) {
                    j--;
                }
                if (i <= j) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;

                }
            } while (i <= j);

            if (start < j) {
                quickShort(chars, start, j);
            }
            if (end > i) {
                quickShort(chars, i, end);
            }
        }

    }

    public static void main(String[] args) {

        System.out.print(" --------------------- ");
        String[] source = new String[]{"sss", "asd", "aad", "ads", "ada", "sda", "das", "dsa", "ssd", "dds"};
        String target = "aad";
        for (int i = 0; i < source.length; i++) {
            if (IsBrother(source[i], target)) {
                System.out.print(source[i] + "  ");
            }
        }
    }


}
