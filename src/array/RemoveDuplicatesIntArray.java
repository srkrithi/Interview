package array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesIntArray {
	public static void main(String[] args)
	{
		int all[]=new int[]{1,2,1,2,1,3,4,5,2,7};
		//Arrays.sort(all);
		//System.out.println(Arrays.toString(all));
		HashSet<Integer>set=new HashSet<Integer>();
		for(Integer a:all)
		{
		set.add(a);
		}
		System.out.println(set);
		
		//remove duplicates in sorted array without using extra space
		//TIME O(n) space O(1)
		//use an extra array time O(n) space O(n)
		int arr[] = {1,2,2,3,3,4};
		int j = 0;
		for(int i = 0 ; i < arr.length - 1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];
		for(int num = 0; num < j; num++) {
			System.out.println("elements are "+arr[num]);
		}
	}
	}
