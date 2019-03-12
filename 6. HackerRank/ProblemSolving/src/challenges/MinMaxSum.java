package challenges;

public class MinMaxSum {
    public static void miniMaxSum(int[] arr) {
        sortTheList(arr);
        System.out.println(((long)arr[0]+arr[1]+arr[2]+arr[3])+" "+((long)arr[4]+arr[1]+arr[2]+arr[3]));
    }

    private static void sortTheList(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++)    {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
