class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        ArrayList<Integer>a=new ArrayList<>();
        a.add(min);
        a.add(max);
        return a;
        }
    }

