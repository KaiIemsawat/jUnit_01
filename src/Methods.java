public class Methods {
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public boolean isEvent(int i) {
        return i % 2 == 0;
    }

    public void revArr(int[] arrNum) {
        int e = arrNum.length - 1;
        for(int s = 0; s < arrNum.length/2; s++) {
            int temp = arrNum[s];
            arrNum[s] = arrNum[e];
            arrNum[e] = temp;
            e--;
        }
    }

    public void firstLast(int[] arrNum) {
        int temp = arrNum[0];
        arrNum[0] = arrNum[arrNum.length - 1];
        arrNum[arrNum.length - 1] = temp;
    }
}
