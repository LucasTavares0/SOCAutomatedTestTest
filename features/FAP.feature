#Author: lucas.s_tavares@hotmail.com

#SOC Blog Homepage URL <https://ww2.soc.com.br/fap/>

Feature: Test the FAP calculator functionality

Scenario: User should be able to insert valid values and get a FAP calculation report

Given user is on the home page
When user clicks on FAP option
And user is on the FAP page
And user enters the company name 
And user enters a FAP value
And user enters a RAT percentage
And user enters a salary projection
And user clicks on Estimar FAP button
Then user receive a FAP calculation report 

