package Praktikum05;

public class Sorting {
    private int[] data; 
    private int jmlData;

    
    public Sorting(int[] data) {
        this.jmlData = data.length; 
        this.data = new int[jmlData]; 
        for (int i = 0; i < jmlData; i++) {
            this.data[i] = data[i];
        }
    }

    public void bubbleSort() {
        int temp;
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void SelectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int minIndex = i; 
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j; 
                }
            }
           
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j]; 
                j--;
            }
            data[j + 1] = temp; 
        }
    }
}

