@login
Feature: Login Feature for the Lockthedeal.com

Scenario: cucumber setup
Given Go to the web page 
And Enter the user name and password
When Submit the Login page
Then User should navigate to the login page and comes with "Orders" link