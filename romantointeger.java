class Solution {
    public int romanToInt(String s) {
       int pre = 0, cur = 0, res = 0; 
    for(int i=0; i< s.length(); i++){
        switch(s.charAt(i)){
            case 'M': cur = 1000;
                break;
            case 'D': cur = 500;
                break;
            case 'C': cur = 100;
                break;
            case 'L': cur = 50;
                break;
            case 'X': cur = 10;
                break;
            case 'V': cur = 5;
                break;
            case 'I': cur = 1;
                break;
        }
        if(cur > pre )
            res += cur - 2*pre ;
        else
            res += cur ;
        pre = cur ;
    }
    return res;  
    }
}
