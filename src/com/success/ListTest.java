package com.success;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ListTest {
    public static void main(String[] args) {
//        testListCapacity();
//        Arrays.copyOf()
//        TreeMap map = new TreeMap();
//        map.put(1,1);
//        map.put(1,2);
//        Set set = map.entrySet();
//        System.out.println(set.size());
//        for (Object o:set
//             ) {
//            System.out.println(o.toString());
//
//        }
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashMap map = new HashMap();
        Hashtable hashtable = new Hashtable();
        HashSet hashSet = new HashSet();
        Vector vector = new Vector();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        TreeMap treeMap = new TreeMap();
        TreeSet treeSet = new TreeSet();

//        concurrentHashMap.put(null, null);
//        hashtable.put(null,null);
        map.put(null, null);


    }

    /**
     * 测试看出初始容量和扩容
     */
    private static void testListCapacity() {
        ArrayList list1 = new ArrayList();
        getCapacity(list1);
        for (int i = 0; i < 11; i++) {
            list1.add("abc1");
        }
        getCapacity(list1);
    }

    /**
     * 通过反射查看list的容量
     * @param list
     * @return
     */
    private static Integer getCapacity(ArrayList list){
        Integer length = null;
        Class claszz = list.getClass();
        try {
            Field field = claszz.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] o = (Object[]) field.get(list);
            System.out.println(o.length);
            return o.length;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return length;
    }
}
