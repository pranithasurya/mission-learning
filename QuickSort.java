class QuickSort{
static int arr[] = {10,80,30,90,40,50,70};
public static void main(String args[]){
    
    
    quick(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
        
    }
}

static void quick(int[] arr,int l, int r){
    if(l<r){
    int pos = quicksort(arr,l,r);
    System.out.println(pos);
    quick(arr,l,pos-1);
    quick(arr,pos+1,r);}
    
}

static int quicksort(int[] arr,int l,int r){
	int pivot = l;
	l=l+1;
	while(l<r){
		while(arr[l]<arr[pivot]){
			l++;
		}
		while(arr[r]>arr[pivot]){
			r--;
		}
		if(l<r){
		int temp =arr[r];
		arr[r]= arr[l];
		arr[l] = temp;
		
		l++;
		r--;
		}
	}
	if(r>pivot){
		int temp =arr[r];
		arr[r]= arr[pivot];
		arr[pivot] = temp;
	}
	return r;
	
	
}