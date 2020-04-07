package codility;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        int index = 0;
        while (index < A.length-1 && A[index]<0){
            index++;
        }
        index++;
        while(index<A.length-1 && (A[index]-A[index-1])==1){
            index++;
        }
        if((A[index]-A[index-1])==1)
            return A[index]+1;
        else
            return A[index-1]+1;

    }
}
