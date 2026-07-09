class Solution {
    public int reverse(int num) {
        int x,y=0;
        while(num!=0){
            x=num%10;
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && x > 7)) {
                return 0;
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && x < -8)) {
                return 0;
            }
            y=(y*10)+x;
            num=num/10;
        }
         return y;
    }
}