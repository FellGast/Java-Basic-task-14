package com.max.idea;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[15];

        int min = -20;
        int max = 20;
        int diff = max - min;
        Random random = new Random();

        for(int i =0; i < 15; i++)
        {
            arr[i] = random.nextInt(diff + 1) + min;
        }

        int minarr = arr[0];
        int maxarr = arr[0];

        for(int i = 0; i < 15; i++)
        {
            int t = arr[i];
            if(t > maxarr)
            {
                maxarr = t;
            }
            if(t < minarr)
            {
                minarr = t;
            }
        }

        System.out.println(minarr);
        System.out.println(maxarr);

        if(Math.abs(minarr) > Math.abs(maxarr))
        {
            System.out.println(minarr);
        }
        else
        {
            System.out.println(maxarr);
        }
    }
}
