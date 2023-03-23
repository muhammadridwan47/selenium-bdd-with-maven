<h1 align="center">
    Automation selenium BDD with maven
</h1>

<p>1. Download plugin : </p>
     - Maven Integration plugin <br/>
     - Cucumber reports
     
     
  
<p>2. configuration maven </p>
     - Go to Manage jenkins
    
   ![Screenshot 2023-03-23 at 21 41 39](https://user-images.githubusercontent.com/69374541/227238928-e27c5f47-84e6-45e3-af82-f0d50f3f2ab4.png)
   ![Screenshot 2023-03-23 at 22 21 18](https://user-images.githubusercontent.com/69374541/227250930-60021c42-f1ea-4e45-ad45-fdfa657299b4.png)

   - Go to Manage jenkins
        
        
![Screenshot 2023-03-23 at 21 43 33](https://user-images.githubusercontent.com/69374541/227239531-358bcc4b-1e34-4741-80c5-68807d60d2de.png)


   - Edit configuration

![Screenshot 2023-03-23 at 21 45 01](https://user-images.githubusercontent.com/69374541/227239949-033bd03f-4704-403f-8b60-013e17f41e8a.png)


<p>3. Create new job </p>
  - Click new Item<br/>
    
 ![Screenshot 2023-03-23 at 21 46 55](https://user-images.githubusercontent.com/69374541/227240536-18a94c8a-e476-4d45-a70d-3c16f806851d.png)
 
 
  - Create The job by input name of job and select  Freestyle project Or Maven project<br/>
![Screenshot 2023-03-23 at 21 48 53](https://user-images.githubusercontent.com/69374541/227241151-6abfdf0f-8fe7-43db-b527-5741a850e74a.png)


  - Configuration <br/>
![Screenshot 2023-03-23 at 21 56 20](https://user-images.githubusercontent.com/69374541/227243449-18b4451c-ce95-46ec-9d16-e939271056e2.png)


![Screenshot 2023-03-23 at 21 58 33](https://user-images.githubusercontent.com/69374541/227244086-9e05cc91-9d6d-4f93-8166-64a8b182844c.png)

note: 
 - this configuration only with plugin cucumber: -Dcucumber.plugin="json:target/cucumber-report.json"
 
 
Configuration auto build job every commit:
 
![Screenshot 2023-03-23 at 22 18 46](https://user-images.githubusercontent.com/69374541/227250117-30cb8b7f-fcd1-4aed-ac6e-dabefff59afe.png)


![Screenshot 2023-03-23 at 22 21 51](https://user-images.githubusercontent.com/69374541/227251096-876384a5-a6bc-4e87-a24e-e880db675063.png)

- get the Payload URL
    - download Ngrok: https://ngrok.com/
    - type in ur terminal: ngrok http 8080 // port jenkins runs in terminal <br />
![Screenshot 2023-03-23 at 22 26 34](https://user-images.githubusercontent.com/69374541/227252543-642322eb-25f0-456d-bfa7-6def917f165f.png)
