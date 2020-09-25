 class Interval {
    int start;
    int end;
  }
public class Solution {
    public Interval solve (int n, int k, String str1, String str2) {
        // write code here
        int same = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)==str2.charAt(i)){
                same++;
            }
        }
        Interval interval = new Interval();
        if(n==k){
            interval.start = same;
            interval.end = same;
            return interval;
        }
        if(n==0){
            interval.start = n - same;
            interval.end = n - same;
            return interval;
        }
        int mid = (n+1)/2;
        if(mid>=k){
            if(same>=k){
                interval.start = k-n-same;
                interval.end = k+n-same;
            }else {
                interval.start = (n-same)>k?0:k-(n-same);
                interval.end = n-(k-same);
            }
        }else {
            if(same>=k){
                interval.start = same-k;
                interval.end = n-same+k;
            }else {
                interval.start = (n-same)>k?0:k-(n-same);
                interval.end = same+n-k;
            }
        }
        return interval;

    }
}
