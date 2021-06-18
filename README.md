run mvn clean install
then start spring boot application

1.  /employees   POST save employee


{
      "id" : 6,
      "name": "Michael dd",
      "office": "321b",
      "email" : "michael.stone@oscorp.com",
      "phone" : "415.331.3321",
      "role" : "Teir 3 Support Engineer"
    }
    
    
  2. find one employee 
   http://localhost:8080/employees/5  GET
  
  3. update employee 
     http://localhost:8080/employees/5  POST
     {
      "id" : 6,
      "name": "Michael dd",
      "office": "testtest",
      "email" : "michael.stone@oscorp.com",
      "phone" : "415.331.3321",
      "role" : "Teir 3 Support Engineer"
    }
    
  4. delete employee
  http://localhost:8080/employees/5  delete
  
  
  5. find all employees
     http://localhost:8080/employees  GET
    
    
    