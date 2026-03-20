package com.ilja.Module12;

import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {
    public static boolean hasDuplicate(int[] array) {
        Set<Integer> seen = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
