class Solution {
    public int mySqrt(int x) {
        if (x<2){
            return x;
        }
        int l=1;
        int r=x/2;
        int a=1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid<=x/mid){
                a=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }return a;
    }
}