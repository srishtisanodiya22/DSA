// Given an integer, convert it to a Roman numeral.

 

// -------------------->  Example 1:

// Input: num = 3749

// Output: "MMMDCCXLIX"

// Explanation:

// 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//  700 = DCC as 500 (D) + 100 (C) + 100 (C)
//   40 = XL as 10 (X) less of 50 (L)
//    9 = IX as 1 (I) less of 10 (X)
// Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places

// -------------------->  Example 2:

// Input: num = 58

// Output: "LVIII"

// Explanation:

// 50 = L
//  8 = VIII

// -------------------->  Example 3:

// Input: num = 1994

// Output: "MCMXCIV"

// Explanation:

// 1000 = M
//  900 = CM
//   90 = XC
//    4 = IV
 

// Constraints:

// 1 <= num <= 3999


class Solution {
    public String intToRoman(int num) {
        String res="";
        while(num>0){
            if(num>=1000){
                res=res+"M";
                num=num-1000;
            }
            if(num>=500 && num<1000){
                if(num<900){
                    res=res+"D";
                    num-=500;
                }
                else{
                    res=res+"CM";
                    num=num-900;
                }
            }
            if(num>=100 && num<500){
                if(num<400){
                    res=res+"C";
                    num=num-100;
                }
                else{
                    res=res+"CD";
                    num=num-400;
                }
            }
            if(num>=50 && num<100){
                if(num<90){
                    res=res+"L";
                    num=num-50;
                }
                else{
                    res=res+"XC";
                    num=num-90;
                }
            }
            if(num>=10 && num<50){
                if(num<40){
                    res=res+"X";
                    num=num-10;
                }
                else{
                    res=res+"XL";
                    num=num-40;
                }
            }
            if(num>=5 && num<10){
                if(num<9){
                    res=res+"V";
                    num=num-5;
                }
                else{
                    res=res+"IX";
                    num=num-9;
                }
            }
            if(num>=1 && num<5){
                if(num<4){
                    res=res+"I";
                    num=num-1;
                }
                else{
                    res=res+"IV";
                    num=num-4;
                }
            }
        }
        return res;
    }
}