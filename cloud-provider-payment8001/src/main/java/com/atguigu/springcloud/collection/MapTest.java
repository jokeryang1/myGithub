package com.atguigu.springcloud.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/27 9:46
 */
public class MapTest {

    /*内部类**/
    public static class Teacher{

        private String name;
        private Integer age;
        private String address;
        private String account;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher.setName("大哥");
        teacher.setAge(30);
        teacher.setAddress("四川成都");
        teacherList.add(teacher);
        teacher1.setName("二哥");
        teacher1.setAge(20);
        teacher1.setAddress("四川广汉");
        teacherList.add(teacher1);
        teacher2.setName("三哥");
        teacher2.setAge(18);
        teacher2.setAddress("四川宜宾");
        teacherList.add(teacher2);
        Iterator<Teacher> teacherIterator = teacherList.iterator();
        while (teacherIterator.hasNext()){
            Teacher key = teacherIterator.next();
            System.out.println(key.getAge());
        }
        teacherList.stream().collect(Collectors.groupingBy(Teacher::getName));
        Map<String, List<Teacher>> collect = teacherList.stream().collect(Collectors.groupingBy(Teacher::getName));
        Map<Integer, String> collect1 = teacherList.stream().collect(Collectors.toMap(Teacher::getAge, Teacher::getName, (k1, k2) -> k1));
        Map<String, Teacher> collect2 = teacherList.stream().collect(Collectors.toMap(Teacher::getName,a->a, (k1, k2) -> k2));

       /*增强for循环遍历*/
        for (String key2:collect2.keySet()
        ) {
            System.out.println(key2 + ":" + collect2.get(key2).getAddress());
        }

        for (Map.Entry<String, List<Teacher>> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

            for (Teacher teacher3 : entry.getValue()) {
                System.out.println(teacher3.getName());
            }
        }
        for (Map.Entry<String, Teacher> entry: collect2.entrySet()) {
            System.out.println(entry.getKey() + ":"+ entry.getValue().getAge());

        }

        /*迭代器遍历*/
        Iterator<String> iterator2 = collect2.keySet().iterator();
        while (iterator2.hasNext()){
            String entry = iterator2.next();
            System.out.println(collect2.get(entry).address);
        }

        Iterator<Map.Entry<String, List<Teacher>>> iterator = collect.entrySet().iterator();
        String key = "大哥";
        String value = "二哥";
        if(collect.containsKey(key)){
            System.out.println("我进来了");
        }
        if(collect1.containsValue(key)){
            System.out.println("我出来了");
        }
        while (iterator.hasNext()){
            Map.Entry<String, List<Teacher>> entry = iterator.next();
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
    }
}
