
// Leetcode-42: Trapping Rainwater

public class TrappingRainWater {

    public static int trappedRainwater(int[] hieght){
        int n= hieght.length;

        //calculate left max boundry
        int[] leftmax=new int[n];
        leftmax[0]=hieght[0];
        for (int i = 1; i <n; i++) {
            leftmax[i]=Math.max(hieght[i],leftmax[i-1]);
        }
        //calculate right max boundry
        int[] rightmax=new int[n];
        rightmax[n-1]=hieght[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightmax[i]=Math.max(hieght[i],rightmax[i+1]);
        }
        int trappedWater=0;
        for (int i = 0; i < n; i++) {
            //waterlevel
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            //trappedWater
            trappedWater +=waterLevel - hieght[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int[] hieght={4,2,0,3,2,5};
        System.out.println(trappedRainwater(hieght));
    }
}
