package com.td.test.core;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class HashMapMainTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martin", 27);
        Map<Employee, String> hm = new HashMap<>();
        hm.put(emp1, "Verified");
        emp1.setName("John");
        System.out.println(hm.get(emp1));
    }
}

@Data
class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            return other.name == null;
        } else return name.equals(other.name);
    }
}
