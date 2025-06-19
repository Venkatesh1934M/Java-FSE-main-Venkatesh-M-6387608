public class FinancialForcast{
    public static double findfuturevalue(double principle,double rate,int n){
        if(n==0){
            return principle;
        }
       return findfuturevalue(principle, rate, n-1)*(1+rate);
    }
}