/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){ // n
            for (; j<=n;  j=j*2){ // log(n)
                 //System.out.print("A'");
                 x++;
            }
        }
         for (;k<=j*j; k++){ // n^2
            //System.out.print("A'");
            y++;
         }

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
    /*
    Runtime complexity:
    n + log(n) + n^2 = O(n^2)
    Runtime complexity is O(n^2)
    
    Space complexity:
    i -> 1
    j -> 1
    k -> 1
    x -> 1
    y -> 1
    n -> 1
    Space complexity is O(1)
    */
    
    public static void func2(int n){
        int k,j,i=n;
        while(i>1){ // log(n)
            j=1;
            while(j<n){ // log(n)
                k=0;
                while(k<n){ // n
                    k=k+2;
                   
                }
                j=j*2;
            }
            i=i/2;
        }
       
    }
    /*
    Runtime complexity:
    log(n) + log(n) + n = O(log(n)*n)
    Runtime complexity is O(log(n)*n)
    
    Space complexity:
    i -> 1
    j -> 1
    k -> 1
    n -> 1
    Space complexity is O(1)
    */
    
   // also discuss T(n) = 3 T(n/4) + n
    /*
    a=3
    b=4
    c=1
    f(n)=n
    log(4)3 = 0.79 (Rounded to two decimal places)
    1 > 0.79 - Case 3
    f(n) = n^c
    f(n) = n^1 = n
    T(n) = Theta(n)
    */
    
    
}
