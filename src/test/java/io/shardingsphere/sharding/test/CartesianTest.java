package io.shardingsphere.sharding.test;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: he.tian
 * @time: 2018-10-17 16:02
 */
public class CartesianTest {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");

        Set aset = new HashSet();
        aset.add("1");
        aset.add("2");

        StringBuffer buffer = new StringBuffer();

        Set<List> set1 = Sets.cartesianProduct(set, aset);
        for (List list : set1) {
            System.out.println(list);
            buffer.append(list.get(0)).append(".").append(list.get(1)).append(",");
        }
        System.out.println(buffer.substring(0,buffer.length()-1));
    }
}
