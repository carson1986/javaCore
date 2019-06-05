package com.carson.javacore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 验证集合迭代器遍历跑出异常的问题
 */
public class IteratorExample {

    public static void main(String[] args) {

        /*List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); //Arrays.asList 返回的不可变的数据
        integers.add(0); // 不可以
        integers.set(0, 6); //可以*/

        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> integerIterator = arrayList.iterator(); //在生成迭代器后，不能在对list进行add,remove等操作
//        arrayList.add(6); //不可以
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
