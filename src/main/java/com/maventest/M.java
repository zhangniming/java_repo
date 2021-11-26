package com.maventest;

public class M implements MI{
    public int addNum(int a,int b)
    {
        return a+b;
    }
    public void reverse(char s[])
    {
        int i = 0, j = s.length;
        while (i < j)
        {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
    public int binarySearch(int a[],int key)
    {
        int i=0,j=a.length-1,mid;
        while(i<=j)
        {
            mid = (i+j)/2;
            if(key == a[mid])
                return mid;
            else if(key < a[mid])
                j = mid-1;
            else
                i = mid+1;
        }
        return -1;
    }
    public int[] insertSort(int a[])
    {
            int i=1,j,k;
            int key;
            while(i < a.length)
            {
                    key = a[i];
                    j = i-1;
                    while(j >= 0 && a[j] > key) {
                        a[j+1]=a[j];
                        j--;
                    }
                    a[++j] = key;
                i++;
            }
        int b[] = new int[a.length];
        for(i = 0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        return b;
    }
}
