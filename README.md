<h1 align="center">
    Automation selenium BDD with maven
</h1>

<p>1. Create project: </p>

  ![Screenshot 2023-03-22 at 13 51 22](https://user-images.githubusercontent.com/69374541/226824370-b835d0cd-8f7d-4377-a287-4af8f83f8131.png)
  ![Screenshot 2023-03-22 at 13 52 08](https://user-images.githubusercontent.com/69374541/226824506-5e8ca097-3322-4bce-bb8f-03686e3c43f5.png)
  ![Screenshot 2023-03-22 at 13 52 51](https://user-images.githubusercontent.com/69374541/226824638-ed71a04f-43b6-497b-9f7d-91d926e346f4.png)
  
 <br />
<p>2. Configuration library/dependency: </p>
  - https://mvnrepository.com/artifact/io.cucumber/cucumber-java/6.10.4
  <br />
  - https://mvnrepository.com/artifact/io.cucumber/cucumber-testng/6.10.4
  <br />
  - https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.8.1
  <br />
  
  ![Screenshot 2023-03-22 at 13 57 56](https://user-images.githubusercontent.com/69374541/226825567-29003f27-060b-4f68-b593-093473f0e827.png)
  
<p>3. Install plugin to support this project: </p>
  - Create TestNg XML  <br />
  - Cucumber for Java <br />
  - Gherkin <br />
  
![Screenshot 2023-03-22 at 14 03 23](https://user-images.githubusercontent.com/69374541/226826504-135e9310-e626-4b3c-9f30-eb6ca5229fd8.png)


<br />
More for information: https://www.youtube.com/watch?v=DtSYzJtjfXQ

  <br />
  
 <p>Run this testing:</p>
 
  ```
   mvn test  
  ``` 
  OR specific by tag
  ```
    mvn test -D cucumber.filter.tags="@ui"
  ``` 
  





