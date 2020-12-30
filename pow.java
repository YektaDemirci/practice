/* MIN_VALUE check is copied, I couldnt think of it*/
class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n<0 && n>Integer.MIN_VALUE) {
			x=1/x;
			n=-(n);
		}
        return (n%2 == 0) ? myPow(x*x, n/2) :  x*myPow(x*x, (n-1)/2);
    }
}
