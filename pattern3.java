//pattern printing 

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
    
public class Main {
    public static void main(String[] args) {
int i, j, row=6;   
        int count =1;
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j= 0; j < i; j++)   
{   
//prints stars   
System.out.print( count );   
    count++;
}   
    System.out.println();   
}
//thr
    }
}
