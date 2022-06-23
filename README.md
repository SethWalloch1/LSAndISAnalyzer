# LSAndISAnalyzer
This is a Java program that is created to analyze what happens when you call Linear Search (LS) or Insertion Sort (IS). This prorgams implements both LS and IS but have different use cases for them. It is also responsible for generating an array of numbers, as well as, the percentage of the array that is sorted. In both cases it will print the array that was generated. The array is only printed out if the length of the array is under 21.                                                                                                                                                 
# LS
If you want to analyze LS then how you would call this program is shown in the sample input below. The 5 being the number that we are looking for, the 10 being how long we want the generated array to be, and 0 being that it is 0% sorted. After it has found the desired number, it will print the amount of entries that it checked in the array to find it. If it isn't in the array, then it prints that the number is not found and how much entries it checked.                                                                       

Sample Input:                                                                                                             
java analyzeME LS=5 10 0                                                                                                                
                                                                                                                   
Sample Output:                                                                                                                                      
A = 18 16 11 9 8 6 5 4 3 2                                                                                                                      
Entries Checked: 7                                                                                                                     

# IS
If you want to analyze IS then how you would call this program is also shown in the sample input below. The 10 being the length of the generated array and the 0 being that the generated array is 0% sorted. The main difference is that after it has performed IS, it will reprint the sorted array, as well as, print the amount of swaps it performed.                                                                                           

Sample Input:                                                                                                                                           
java analyzeME IS 10 0                                                                                                                     

Sample Output:                                                                                                                    
A initial = 18 12 9 8 7 6 5 4 3 2                                                                                                                     
A final = 2 3 4 5 6 7 8 9 12 18                                                                                                                     
Num Swaps: 45                                                                                                                                         
