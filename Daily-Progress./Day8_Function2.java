
// primes in range (2 to n)

public class PrimesInRange {
    
    public static boolean  isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesRange(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesRange(17);
    }
}

//Binary to decimal

public class BinaryToDecimal {
        public static void bintodec(int BinNum){
            int myNum=BinNum;
            int pow=0;
            int decNum=0;

            while(BinNum>0){
                int lastDigit=BinNum%10;
                decNum = decNum+lastDigit*(int)Math.pow(2, pow);
                
                pow++;
                BinNum=BinNum/10;
               
            }
            System.out.println("decimal of "+ myNum+ "=" +decNum);
           
        }
    public static void main(String[] args) {    
            bintodec(111);

    }
}

//Decimal to binary

public class DecimalToBinary {


    public static void dectobin(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;

        while (decNum>0) { 
            int rem=decNum%2;
            binNum=binNum + rem*(int)Math.pow(10, pow);

            pow++;
            decNum=decNum/2;
        }
        System.out.println("Binary of "+ myNum+ "=" +binNum);
    }
    public static void main(String[] args) {
        
        dectobin(5);
    }
}

