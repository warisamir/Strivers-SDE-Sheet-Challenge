public class Solution {
    public int solve(int[] A, int B) {
        int xor=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int ct=0;
        for(int i=0;i<A.length;i++)
        {
             xor=xor^A[i];
            int xr=B^xor;
            if(hm.containsKey(xr))
            ct+=hm.get(xr);
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return ct;
    }
}
