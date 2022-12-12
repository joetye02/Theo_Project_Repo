import java.lang.Math;

public class binarySearch{

    public static void main(String[] args){
        int high, low, mid, target;
        int[] theList = {10, 14, 18, 22, 30, 64, 92, 103, 156, 593};
        low = 0;
        high = theList.length - 1;
        mid = high / 2;
        target = 22;

        boolean elementFound = false;
        while(elementFound == false){
            if(theList[mid] == target){
                System.out.println(mid);
                elementFound = true;
            }
            else if(theList[mid] < target){
                low = mid;
                mid = (high + low) / 2;
            }
            else if(theList[mid] > target){
                high = mid;
                mid = (high + low) / 2;
            }
        }
        if(elementFound = true){
                System.out.println("Element found at index " + mid);
        }
    } 
}