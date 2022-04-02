package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int total;
    private boolean isEmployee;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("total") int total, @JsonProperty("employee")boolean isEmployee) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isEmployee = isEmployee;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return this.total;

    }

    public int setTotal() {
       if(isEmployee){int h =total/100;
           int discount = (int) (total*0.3+((total/100) *5));
          return this.total = (int) (total-discount);

       }else {
           int discount = (int) (total*0.1+((total/100) *5));
         return   this.total = (int) (total-discount);
       }

    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }
}
