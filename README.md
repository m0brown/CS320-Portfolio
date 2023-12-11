# CS320-Portfolio

### How can I ensure that my code, program, or software is functional and secure?

I can ensure that my code is functional by creating proper tests based on the developed user stories. In the end, the program has to function correctly, and as expected for the users, so testing must match the expectations that the users will have. Secure coding must be a priority from the beginning of designing the program. Making sure that proper authentication and authorization parameters are put in place is crucial for building a foundation of secure coding to build upon as that program grows.


### How do I interpret user needs and incorporate them into a program?

User needs should be incorporated into the user stories created during the software development lifecycle. Then any code is built off of these user needs.


### How do I approach designing software?
I like to use an incremental and iterative approach to designing software. I also write a bit of pseudocode before each project to help me understand how I want everything to work together. In this class, I've learned that I like to write all my programs first, then create the test cases based on the user's needs. This checks my program for completeness rather than writing the program for the test cases.


### Code Summary
The software requirements for the Task Class wanted the string task ID to be unique, so I created a test in TaskServiceTest.java that would test if the program would accept a new task with the same task ID as a task already in the system. The Task Class requirements wanted a task object with a task ID of fewer than 11 characters and not null; this was tested in the TaskTest.java file to check if the program would accept a task ID over ten characters or a null ID. The Task Class requirements also wanted the string task name to be not null and to be less than 21 characters. I added a test in the TaskTest.java file to test if the program would accept a task name longer than 20 characters or a null name. Finally, the Task Class requirements wanted a task object with a string description of fewer than 51 characters and not null; this was also tested in the TaskTest.java file to check if the program would accept a task description over 50 characters or a null description.

My tests met all of the requirements from the instructions. My coverage for TaskTest.java was 84.8% for the Test.java file. My coverage for the TaskServiceTest.java was 83.7% for the Test Service Class. I have written other catches and error handling in my TaskService.java code that was not required to test. All of the code that was required was tested and passed.

In the TaskService.java file, on lines 13-20, there is error handling if the user tries to input a task with the same ID as another task already in the system. This is a creative way of checking this requirement and handling the error of redundant task IDs since it will prompt the user that there is already a task with the same ID and they need to create a unique one. In the Task.java file, in the Constructor, starting on line 9, I created checks that would throw errors if the task ID, name, or description was not in line with the program's requirements.

My code is efficient because there are few lines of extra code that do not directly relate to the program's requirements. Many of these lines were not tested, but they were important to the program's framework, such as the setter methods on lines 43-62. I also wrote one test per requirement to ensure that all of the program's tests were relevant to the requirements for the program's functionality
