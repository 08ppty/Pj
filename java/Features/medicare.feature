Feature: Test MediCare Website
  Scenario: Test the Medicare website
   Given User Test API
   When  Get REQUEST
   Then  Validate
   Given  User Test API1 
   When Post Request1
   Then Validate1
   Given User Test API2
   When Delete Request2
   Then Validate2
   Given User Test API3
   When  Put rEQUEST3
   Then Validate3
   
   