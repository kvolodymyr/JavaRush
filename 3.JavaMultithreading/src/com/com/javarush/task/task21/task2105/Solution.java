package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (!(n instanceof Solution)) {
            return false;
        }
        if (n == this) {
          return true;
        }
        Solution s = (Solution)n;
        return ((s.first != null && first != null) ? s.first.equals(first) : s.first == first /* == null */) &&
                ((s.last != null && last != null) ? s.last.equals(last) : s.last == last /* == null */);
    }

    public int hashCode() {
        return 31 * ((first != null) ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
