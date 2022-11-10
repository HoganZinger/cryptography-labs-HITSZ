package cypher.euclidean;

import java.math.BigInteger;

public class EEA {
    public static BigInteger[] extend_gcd(BigInteger a,BigInteger b){
        BigInteger ans;
        BigInteger[] result=new BigInteger[3];
        if(b.compareTo(BigInteger.ZERO)==0)
        {
            result[0]=a;
            result[1]=BigInteger.ONE;
            result[2]=BigInteger.ZERO;
            return result;
        }
        BigInteger [] temp=extend_gcd(b,a.mod(b));
        ans = temp[0];
        result[0]=ans;
        result[1]=temp[2];
        result[2]=temp[1].subtract((a.divide(b)).multiply(temp[2]));
        return result;
    }

}

