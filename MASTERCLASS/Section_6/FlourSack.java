package MASTERCLASS.Section_6;

public class FlourSack {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        while(goal>0) {
            if(bigCount>0 && goal>=5) {
                goal-=5;
                bigCount--;
            }
            else if(smallCount>0) {
                goal--;
                smallCount--;
            }
            else if(bigCount<=0 && smallCount<=0) {
                break;
            }
            else {
                break;
            }
            // if(goal>=5 && bigCount>0) {
            //     bigCount--;
            //     goal-=5;
            //     if(bigCount<=0) {
            //         break;
            //     }
            // }
            // else {
            //     smallCount--;
            //     goal-=1;
            //     if(smallCount<=0) {
            //         break;
            //     }
            // }
        }
        if(goal==0) {
            return true;
        }
        return false;
    }
}