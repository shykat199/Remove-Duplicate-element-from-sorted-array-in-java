//Time complexity is: O(nlogn)
//Remove Duplicate value from Sorted array

import java.util.*;

public class DuplicatermvSort {
    int a[] = new int[10];
    int t[] = new int[];
    Scanner sc = new Scanner(System.in);
    int i, j, n;

    public void dup() {
        System.out.print("enter the element number in array:");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("elemet of is:" + a[i]);
        }
        rmv();
    }

    // a[]={1,2,2,3,4,4,5,5}
    // int tem[]=new int[] =>[ ]
    public void rmv() {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                t[j] = a[i];
                j++;
            }
        }
        t[j] = a[a.length - 1];
        for (int i = 0; i < n; i++) {
            System.out.println("element is:" + t[i]);
        }
        show();
    }

    public void show() {
        for (int i = 0; i < n; i++) {
            System.out.println("element is:" + a[i]);
        }
    }

    public static void main(String[] args) {
        DuplicatermvSort d = new DuplicatermvSort();
        d.dup();
    }
}
