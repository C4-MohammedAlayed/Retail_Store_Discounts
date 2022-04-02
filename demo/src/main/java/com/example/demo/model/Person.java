package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int total;
    private boolean isEmployee;
    private String discount ;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("total") int total, @JsonProperty("isEmployee")boolean isEmployee,@JsonProperty("discount") String discount) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isEmployee = isEmployee;
        this.discount=discount;
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
       return this.total;

    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }


    public String setDiscount() {
        int total =getTotal();
        int disc =0;
        if(isEmployee()){
             disc = (int) (total*0.3+((total/100) *5));
             total-=disc;
        }else{
             disc = (int) (total*0.1+((total/100) *5));
            total-=disc;
        }
      return   this.discount = String.format("you get a $%s".formatted(disc)) + " discount on orders,the net payable amount after discount will be $%s".formatted(total);
    }

    public String getDiscount() {
        return discount;
    }
}
