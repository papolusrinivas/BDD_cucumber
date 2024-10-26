Feature: Frm application login
Scenario Outline: FRM crm create a new contact
Given user is alredy in home page
When  click on login button
Then  user is on login page
Then  me enter "<username>" and "<password>" into the login form
Then user is click login in login page 
Then user is on mainpage 
Then click on Tasks
Then  I  "<title>" and "<company>" into the task
Then  click on save button 

Examples:
|username                   | password |  title   |  company |
|papolusrinivasu66@gmail.com| Test@2929| srini    | Tesst    |
|papolusrinivasu66@gmail.com| Test@2929|sup       | TCS      |

