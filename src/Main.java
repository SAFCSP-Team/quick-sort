public class Main {

  public static void main(String[] args){

  int[] arr = {
    10, 7, 8, 9, 1, 5
  };
  printArray(arr);
  quickSort(arr, 0, arr.length-1);
  printArray(arr);
	
  }


  public static void swap(int[] arr,int i, int j){
    int min = arr[i];
    arr[i] = arr[j];
    arr[j] = min;
  }

  public static int partion(int[] arr,int low,int high){
    int pivot = arr[high];
    int i = low - 1;
    for(int j = low; j < high; j++){
      if(arr[j] <= pivot){
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i+1, high);
    return i++;
  }


  public static void quickSort(int[] arr,int low,int high){
    if(low < high){
      int pivotIndex = partion(arr, low, high);
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex+1, high);
    }

  }
  public static void printArray(int[]arr){
    for(int x = 0; x<arr.length; x++){
      if (x + 1 == arr.length){
        System.out.print(arr[x]);
      }else{
    System.out.print(arr[x] + ",");
      }
    }System.out.println();
  }
}
