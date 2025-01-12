// consecutive "1" -->11 is not allowed

public class BinaryString {

    public static void printBinstring(int n,int lastpalce,String str){

        if (n==0){
            System.out.println(str);
            return;
        }
        printBinstring(n-1,0,str+"0");

        if (lastpalce==0){
            printBinstring(n-1,1,str+"1");
        }

    }

    public static void main(String[] args) {
        printBinstring(2,0,"");
    }
}


public class FriendsPairing {
    public static int frdsparing(int n){
        if (n==1 || n==2){
            return n;
        }
        //singal
//        int fnm1=frdsparing(n-1);
//
//        //pairs
//        int fnm2=frdsparing(n-2);
//        int pairways=(n-1)*fnm2;
//
//        int totways=fnm1+pairways;
//        return totways;

        return frdsparing(n-1)+(n-1) * frdsparing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(frdsparing(3));
    }
}


public class RemoveDuplicate {


    public static void rmvDuplicates(String str,int idx,StringBuilder newString,boolean map[]){

        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar -'a']==true){
            //duplicate
            rmvDuplicates(str,idx+1,newString,map);
        }else {
            map[currChar-'a']=true;
            rmvDuplicates(str,idx+1,newString.append(currChar),map);
        }
    }

    public static void main(String[] args) {
        String str="ddarshhaa";
        rmvDuplicates(str,0,new StringBuilder(""),new boolean [26]);
    }
}


public class TilingProblem {

    public static int tiling(int n){
        if (n==0 || n==1){
            return 1;
        }
        //vertical
        int fnm1=tiling(n-1);

        //horizontal
        int fnm2=tiling(n-2);

        int total_ways=fnm1+fnm2;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}


public class XpowerN {

    //TC ==>o(n)

//    public static int power(int x,int n){
//        if(n==0){
//            return 1;
//        }
////        int Xnm1=power(x,n-1);
////        int xn=x*Xnm1;
////        return xn;
//        return x*power(x,n-1);
//
//    }
// Optimized approach
    //TC ==> o(log n)

    public static int OptimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=OptimizedPower(a,n/2);
        int halfpowersq=halfpower*halfpower;

        if (n%2!=0){
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        //System.out.println(power(2,10));
        System.out.println(OptimizedPower(2,5));
    }
}
