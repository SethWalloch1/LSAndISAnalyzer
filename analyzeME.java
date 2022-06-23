//Author: Seth Walloch

public class analyzeME {

    //Varbiables to keep track of swaps and entries checked
    static int comparisonCount = 0;
    static int checked = 0;

    //returns the amount of swaps
    public static int getComparisonCount(){
        return comparisonCount;
    }

    //returns the amount of entries checked
    public static int getCheckedCount(){
        return checked;
    }
    
    //Algorithm to sort an array using Insertion Sort
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int element = A[i];
            int j = i - 1;
            while((j > -1) && (A[j] > element)){
                A[j+1] = A[j];
                j--;
                comparisonCount = comparisonCount + 1;
            }
            A[j + 1] = element;
        }
    }

    //Method to print an array
    public static void printArray(int[] A){
        System.out.print("A = ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    //Method to print an array with "A initial = " in front of it
    public static void printArrayInitial(int[] A){
        System.out.print("A initial = ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    //Method to print an array with "A Final = " in front of it
    public static void printArrayFinal(int[] A){
        System.out.print("A final = ");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    } 

    //Method to get an array that can be generated at a percent sorted already
    public static int[] getArray(int n, int percentage){
        int[] A = new int[n];
        int counter = 1;
        for(int i = 0; i < n; i++){
            A[i] = counter;
            counter = counter + 1;
        }
        double fix = (100 - percentage);
        double fix2 = (fix / 100);
        double n2 = n;
        double finalFix = fix2*n2;
        int min = (n+1);
        int max = (n*2);
        for(int j = 0; j < finalFix; j++){
            A[j] = (int) (Math.random() * ((max) - (min) + 1) + (min));
            max = A[j] - 1;
            min = min - 1;
        }
        return A;
    }

    //Method to handle checking every item in an array until it finds the item it is looking for or it ends 
    // and returns -1 meaning that it is not there
    public static int linearSearch(int[] A, int goal){
        for(int i = 0; i < A.length; i++){
            checked = checked + 1;
            if(A[i] == goal){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {

        int goal = -1;
        String type = args[0];
        int size = Integer.parseInt(args[1]);
        int percentage = Integer.parseInt(args[2]);

        //Made to handle getting the number to search for if it is LS
        if(type.length() >= 4){
            char[] result = type.toCharArray();
            String goal2 = "";
            for(int i = 0; i < result.length; i++){
                if(result[i] == ('=')){
                    for(int j = i+1; j < result.length; j++){
                        goal2 += result[j];
                    }
                }
            }
            goal = Integer.parseInt(goal2);
            char temp = result[0];
            char temp2 = result[1];
            type = "";
            type += temp;
            type += temp2;
        }

        //Made to handle either IS or LS depending on the users input
        if(type.equals("IS")){
            int[] A = getArray(size, percentage);
            if(size < 21){
                printArrayInitial(A);
            }
            insertionSort(A);
            if(size < 21){
                printArrayFinal(A);
            }
            getComparisonCount();
            int count = getComparisonCount();
            System.out.println("Num Swaps: " + count);

        }else if(type.equals("LS")){
            int[] A = getArray(size, percentage);
            if(size < 21){
                printArray(A);
            }
            int answer = linearSearch(A, goal);
            int entries = getCheckedCount();
            if(answer == -1){
                System.out.println("Entries Checked: " + entries + ", Not Found");
            }else{
                System.out.println("Entries Checked: " + entries);
            }
        }
    }
}