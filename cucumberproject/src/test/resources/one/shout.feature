Feature: shout Feature
@tag1
Scenario: Saun and lucia are within range
Given Saun is 20 meters away from lucia
When Saun shouts "free coffee"
Then Lucia listens to the message
@tag2
 Scenario: 
 Given  Saun is 1000 meters away from lucia 
 When  Saun shouts "free coffee"
 Then  Lucia cannot listen to the message