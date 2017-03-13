import java.io.*;

class MergeSort {
    
    
    private void mergeData(int[] arr, int l, int m, int r){
        //printData(arr);
        int fl=l, sl=m+1; int i=0;
        int[] myArr= new int[r-l+1];
        while(fl<=m && sl<=r){
            if(arr[fl]<arr[sl]){
                myArr[i++]=arr[fl++];
            }else if(arr[fl]>arr[sl]){
                myArr[i++]=arr[sl++];
            }else{
                myArr[i++]=arr[fl++];
                myArr[i++]=arr[sl++];
            }
            
        }
        while(fl<=m){
            myArr[i++]=arr[fl++];
        }
        while(sl<=r){
            myArr[i++] = arr[sl++];
        }
        int k=0;
        for(i=l;i<=r;i++){
            arr[i]=myArr[k++];
        }
    }
    
    private void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int m= (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            mergeData(arr,l,m,r);
        }
        
    }
    
    private void printData(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    
	public static void main (String[] args) {
		int[] arr={10,7,38,1,45,23,2,79};
		MergeSort m= new MergeSort();
		m.mergeSort(arr,0,arr.length-1);
		m.printData(arr);
	}
}