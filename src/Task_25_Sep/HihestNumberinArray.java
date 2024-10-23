package Task_25_Sep;

public class HihestNumberinArray {
    public static void main(String[] args){
    int arr[]={100,299,400,202,-121};


int max=arr[0];

for(int i=0;i<arr.length;i++) {

    if(arr[i]>max)
        max=arr[i];

    }
        System.out.println("Largest element present in given array: " + max);

    }

}



