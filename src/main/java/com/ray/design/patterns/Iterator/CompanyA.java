package com.ray.design.patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CompanyA implements Aggregate {

    List<Employee> employees = new ArrayList<>();


    public CompanyA(){

        //為了方便先預先放入員工
        employees.add(new Employee("小萱","業務"));
        employees.add(new Employee("小尉","工程師"));
        employees.add(new Employee("小陞","程序猿"));
        employees.add(new Employee("阿偉","專案管理"));
        employees.add(new Employee("小詩","吉祥物"));
        employees.add(new Employee("阿農","分析兼司機"));


    }


    @Override
    public Iterator CreateIterator() {
        return new CompanaAIterator(this);
    }
}