

<p align="center">
  <a href="" rel="noopener">
 
</p>
<h3 align="center">Retail_Store_Discounts</h3>

---

 

</p>

## 📝 Table of Contents

- [About](#about)

- [usage](#usage)
- [Built Using](#built_using)


## 🧐 About <a name = "about"></a>

Finding the net payable amount:
1. If the user is an employee of the store, he gets a 30% discount on orders. 
2. If the user is a regular customer of the store, he gets a 10% discount. 
3. For every $100 on the bill, there would be a $ 5 discount.
                      
## 🎈 usage <a name = "usage"></a>
### Step 1

We will create 2 person one of them is employee 
Post request to http://localhost:8080/api/v1/person
```
{ 
    "name":"mohammed",
    "total":990,
    "employee":true   
}

{ 
    "name":"omar",
    "total":990,
    "employee":false   
}
    
```
### Step 2
To see how much discount for each one of them
Get request to http://localhost:8080/api/v1/person
the results will be 
```
[
    {
        "id": "33df78a5-843c-4ce5-9d31-5cdfa9ed53ab",
        "name": "mohammed",
        "total": 990,
        "discount": "you get a $342 discount on orders,the net payable amount after discount will be $648",
        "employee": true
    },
    {
        "id": "aaebe08b-f8cf-4c7f-8886-769ee99fccd8",
        "name": "omar",
        "total": 990,
        "discount": "you get a $144 discount on orders,the net payable amount after discount will be $846",
        "employee": false
    }
]
```


## ⛏️ Built Using <a name = "built_using"></a>

- [Java Spring Boot](https://spring.io/projects/spring-boot)  
