class Solution {
    public double myPow(double x, int n) {
        // base case
        if(n == 0) return 1.0;

        // handle negative exponent carefully
        if(n < 0) {
            // avoid overflow when n = Integer.MIN_VALUE
            if(n == Integer.MIN_VALUE) {
                return myPow(1/x, -(n+1)) * (1/x);
            }
            x = 1 / x;
            n = -n;
        }

        double half = myPow(x, n / 2);

        if(n % 2 == 0) return half * half;
        else return half * half * x;
    }
}
