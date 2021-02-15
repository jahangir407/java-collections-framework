package com.jhub.org.ArrayListConcept;

import java.util.ArrayList;

/**
 * In this demo class, we will different ways of initializing ArrayList
 * @author Md Jahangir Hossain Bhuyain
 * @version 0.1
 * @since February 15, 2021
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("---------Different ways of initializing ArrayList-------------");

        //-------------------------Java Non-generic Vs Generic Collection------------------------
        /**
         * - Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
         * - Java new generic collection allows to have only one type of object in a collection.
         * - Now it is type safe so typecasting is not required at runtime.
         */


        //---------------------------Example of non-generic java collection----------------------
        /**
         * non-generic collection is not type safe.
         * so need to cast at runtime, which can generate runtime exceptions.
         */

        ArrayList nonGenericList = new ArrayList();

        nonGenericList.add(5);
        nonGenericList.add("string data");
        nonGenericList.add(4.4f);
        nonGenericList.add(5l);
        nonGenericList.add('C');

        System.out.println("------------------Traversing non-generic collection-----------------------");
        for(Object o: nonGenericList){
            System.out.println(o);
        }

        //-----------------------------Example of generic java collection--------------------------


    }
}
