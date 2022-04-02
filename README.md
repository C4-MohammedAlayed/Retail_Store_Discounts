

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

we will create 2 person one of them is employee 
Post request to http://localhost:8080/api/v1/person
```
{ 
    "name":"omar",
    "total":990,
    "employee":false   
}

{ 
    "name":"mohammed",
    "total":1500,
    "employee":true   
}
    
```
to see how much discount for each one of them
Get request to http://localhost:8080/api/v1/person
the results will be 
```
[
    {
        "id": "1da78d9e-34e7-43e8-9855-5eba59f069fe",
        "name": "mohammed",
        "total": 990,
        "discount": "you get a $342 discount on orders,the net payable amount after discount will be $648",
        "employee": true
    },
    {
        "id": "e11e8114-6338-4113-bb13-3c862b16a644",
        "name": "omar",
        "total": 990,
        "discount": "you get a $144 discount on orders,the net payable amount after discount will be $846",
        "employee": false
    }
]
```


## ⛏️ Built Using <a name = "built_using"></a>

- [Java Spring Boot](https://spring.io/projects/spring-boot)  
