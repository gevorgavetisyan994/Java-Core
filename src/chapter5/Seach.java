package chapter5;

public class Seach {
    public static void main(String[] args) {
        int nums[] = {6,8,3,7,5,6,1,4,6};
        int val = 6;
        boolean found = false;
        for (int x:nums){
            if ( x == val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println( "Value fond !" + val);
    }
}
