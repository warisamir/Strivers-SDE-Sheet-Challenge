class Solution {
    public double myPow(double x, int n) {
//         if(x==1)
//             return 1;
//         if(x==-1)
//             return (n&1)==0 ?1:-1;
//         if(n<=Integer.MIN_VALUE)
//             return 0; 
//         double ans=1;
//         boolean neg=n<0;
//         n=Math.abs(n);
//         while(n>0){
//             int l=n&1;
//             n=n>>1;
//             if(l==1)
//                 ans*=x;
        
//         x*=x;
//         }
//         if(neg){
//             ans=1/ans;
//         }
//         return ans;
        if(n<0)
            return 1/Pow(x,n);
        return Pow(x,n);
    }
    double Pow(double x,int n){
        if(n==0)
            return 1.0;
         double xsqr=Pow(x,n/2);
        if((n&1)==0)
           xsqr=xsqr*xsqr;
         else
             xsqr=xsqr*xsqr*x;
         return xsqr;
    }
}
