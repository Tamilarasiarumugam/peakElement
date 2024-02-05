package assignments;

public class PeakElement {
	
	 public static int findPeak(int arr[]) 
	    { 
	        int fir=0;
	        int last=arr.length-1;
	        
	        while(fir<last)
	        {
	        	int mid=fir+(last-fir)/2;
	        	if(arr[mid]<arr[mid+1])
	        	{
	        		fir=mid+1;
	        	}
	        	else
	        	{
	        		 last=mid;
	        	}
	        	  
	        }
	        return fir;
	    } 
	
	public static void main(String[] args)
	{
		int arr[]= {10,20,15,2,23,90,67};
		
		int peakIndex=findPeak(arr);
		int peakElement=arr[peakIndex];
		System.out.println("peak insex is: "+peakIndex+" and "+"peak element is :"+peakElement);
	}

}

