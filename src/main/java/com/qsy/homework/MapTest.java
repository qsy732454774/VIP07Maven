package com.qsy.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> add=new HashMap<>();
        add.put("张三","北京");
        add.put("李四","上海");
        add.put("王五","西安");
        add.put("赵六","杭州");
        System.out.println(add);
        for (String key:add.keySet()
             ) {
            System.out.println("姓名:"+key+"   "+"地址:"+add.get(key));
        }
        Iterator<String> KeyValue=add.keySet().iterator();
        while (KeyValue.hasNext()){
            String key = KeyValue.next();
            System.out.println(key+add.get(key));
        }
    }
}
