package com.ilja.Module12;

import java.util.HashMap;
import java.util.Map;

public class TwoIndexes {
    public static int[] getTwoIndexes(int[] array, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (hashMap.containsKey(complement)) {
                return new int[] {hashMap.get(complement), i};
            }

            hashMap.put(array[i], i);
        }

        return null;
    }
}
