package Arrays;

import java.util.*;
public class LargestElementInArray{
public static void main(String[] args) {
  int[] arr={2,5,4,1,3};
  int largest=arr[0];
  for(int i=0; i<arr.length; i++)
  {
    if(arr[i]>largest)
    {
      largest=arr[i];
    }
  }
  System.out.println(largest);
}
}