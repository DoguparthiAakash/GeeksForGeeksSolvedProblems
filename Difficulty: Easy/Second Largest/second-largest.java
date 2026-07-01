class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < arr.length; i++) {
            
            // Found new largest
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            
            // Update second largest (avoid duplicates)
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}