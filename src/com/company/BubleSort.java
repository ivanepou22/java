package com.company;

public class BubleSort {
    public void sort(int[] Array){
        for (int i = 0; i<Array.length; i++){
            for (int j=1; j<Array.length; j++){
                if (Array[j] < Array[j-1]){
                    swap(Array, j, j-1);
                }
            }
        }
    }
    private void swap(int[] num, int index, int index1){
        int temp1 = num[index];
        num[index] = num[index1];
        num[index1] = temp1;
    }
}
