public class MinMax {
    public int max(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public int min(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args){
        MinMax test= new MinMax();
        int[] arr={5,1,7,8,10,4};
        System.out.println(test.max(arr));
        System.out.println(test.min(arr));
    }
}
