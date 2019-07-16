package com.ray.design.patterns.Iterator;

public class CompanaAIterator implements Iterator {

    private CompanyA companyA;
    private int current = 0;

    public CompanaAIterator(CompanyA companyA){
        this.companyA = companyA;
    }

    @Override
    public Object First() {
        return companyA.employees.get(current);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if( current < companyA.employees.size()){
            ret = companyA.employees.get(current);
        }

        return ret;
    }

    @Override
    public boolean IsDone() {
        return current >= companyA.employees.size() ? true : false ;
    }

    @Override
    public Object CurrentItem() {
        return companyA.employees.get(current);
    }
}