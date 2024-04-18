class InsertionSort{
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void insertionSort(int[] arr){
        int i = 1;
        while( i < arr.length){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
                j--;
            }
            arr[j + 1] = temp;
            i++;
        }
    }

    public static void main(String[] args){
        int[] arr= new int[]{9,8,7,6,5,4,3,2,1,0};
        printArray(arr);

        System.out.println();
        System.out.println("Sorted array : ");
        insertionSort(arr);
        printArray(arr);
    }
}