Feature: login page
Scenario: customer login
Given url for login page "http://10.232.237.143:443/TestMeApp/login.htm"
When customer enters the username "hulkaa"
And customer enter the  password "hulk123"
Then customer clicks on login button 
