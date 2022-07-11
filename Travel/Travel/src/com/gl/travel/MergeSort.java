package com.gl.travel;

public class MergeSort {
	static void merge(int arr[], int left, int mid, int right )
	{
		//find size of toe sub arrays to be merged
		int n1=mid-left+1;
		int n2=right-mid;
		
		//create temp array
		int leftArray[]=new int[n1];
		int rightArray[]=new int[n2];
		
		
		//copy data to temporary arrays
		
		for (int i=0; i<n1; i++)
			leftArray[i]=arr[left + i];
		for(int j=0; j<n2; j++)
			rightArray[j]=arr[mid+1+j];
		
		
		//merge the temporary array
		
		int i=0, j=0;
		
		int k= left;
		while(i < n1 && j < n2)
		{
			if (leftArray[i]>= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}
			k++;
			
		}
		
		//copy remaining elements
		
		while (i<n1)
		{
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		
		while (j<n2)
		{
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
	public static void sort(int arr[], int left,int right)
	{
		if (left<right)
		{
			int mid = (left + right) / 2;
			
			sort (arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
		
	}}

