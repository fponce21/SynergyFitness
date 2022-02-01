# Synergy Fitness Backend
Synergy Fitness is a fitness-based social media app where trainers and users can interact to talk about physical and mental health.

## Technologies Used
- Spring Boot 2.0
- Spring Test
- Spring Data/MVC
- JUnit 5
- Mockito 4
- Cucumber 7
- Selenium 4
- HTML 5 with CSS
- Angular 7
- Angular Material
- Amazon Web Services (AWS)

## Features
List of features ready and TODOs for future development
1. Users can log in and out
2. Trainers can log in and out
3. Users can view trainers posts.
4. Users can update their own profile.
5. Users can input calories into calorie tracker.
6. Trainers can create posts with media.
7. Trainers can update personal "about me" sections.
8. 90% of Controller/Service unit tests are successful.
9. Cucumber/Selenium tests running successfully
  - To-Do List:
1. Get comment and like features running.
2. Get remaining controller/service tests to be successful.

## Getting Started
1. Go to your Documents folder
2. Make a new folder
3. Rename your new folder "SynergyFitness"
- If You Have a Windows Computer
4. Open a new Command Prompt in your SynergyFitness folder like this.
![image](https://user-images.githubusercontent.com/94322184/152011589-5d4d10b6-fd03-4d91-90e7-12f0b2c1845a.png)

- If You Have a Mac
4. Open a new terminal in your SynergyFitness folder like this.
![image](https://user-images.githubusercontent.com/94322184/152011729-6212ff80-0b1c-46b0-89d4-fad73c4b24a3.png)

- Joint Instructions
5. Go to this project's GitHub page and clicking on the green code button.
![synfitCode](https://user-images.githubusercontent.com/94322184/152022452-c7137f43-00df-4346-88a5-651c765d5554.png)

6. Most of you want HTTPS
7. Click the double boxes to copy this command.

![synfitHTTPS](https://user-images.githubusercontent.com/94322184/152022609-4769afa7-2836-4a5c-8c07-b3b6f2b4ec3b.png)

- If You Have a Windows Computer
8. Go back to your command prompt that you opened in step 4.
- If You Have a Mac
8. Go back to your terminal that you opened in step 4.
- Joint Instructions
9. Type
    - git clone [paste url here]
- Now we check if you have Java and if you do, which version.
10. In your command prompt/terminal type:
  - java -version
11. It should look something like this.

![cmdjavac](https://user-images.githubusercontent.com/94322184/152013330-76c1280c-cf97-4320-84b3-d4b15b331a64.png)

13. If there is no return value or the version number is below 8 go here. Follow the instructions for your operating system.
14. Next you will install PostgreSQL from here. Follow the instructions for your operating system.
15. Install Eclipse from https://www.eclipse.org/downloads/packages/installer
 - In step 9. you cloned the repository into your new folder SynergyFitness. Now you have Java, Eclipse, and VS Code installed on your system.
17. Open Eclipse IDE for Enterprise Developers
18. Go to File -> Import -> Maven -> Existing Maven Projects
19. Browse for SynergyFitness
28. Make a application.properties in src/main/resources that looks similar to this:
![image](https://user-images.githubusercontent.com/94322184/152013780-fa8bf42e-85a4-46a8-947a-1722baa16fac.png)

29. This application.properties file will establish a connect to our AWS EC2 Database.
33. Expand src/main/java -> com.revature.app -> TRMSApp.java
34. Right click on TRMSApp.java
35. Select Run as -> Java Application
![trmsapprun](https://user-images.githubusercontent.com/94322184/152014984-953bc108-a1bf-42b2-9a11-a206674e59a1.png)

![javalin](https://user-images.githubusercontent.com/94322184/152015026-a0412d09-43d6-425d-98b3-850003fa42cb.png)

36. Start the App by going to the directory that you placed the TRMS App into, navigating to trms-front -> html
37. Open index.html in a web browser of your choice
38. You are ready to run the TRMS.

## Contributors
- Ricky
- Christian
- Carlo

## License

Copyright (c) 2022 Francisco Antonio Ponce

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
