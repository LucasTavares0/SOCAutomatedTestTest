#Author: lucas.s_tavares@hotmail.com

#SOC Blog Homepage URL <https://ww2.soc.com.br/fap/>

Feature: Test the FAP calculator functionality

Scenario Outline: User should be able to insert valid values and get a FAP calculation report

Given user is on the home page
When user clicks on FAP option
And user is on the FAP page
And user enters the company name <companyname> 
And user enters a fap value <FAPvalue>
And user enters a rat percentage <RATpercentage>
And user enters a salary projection <salaryprojection>
And user clicks on Estimar FAP button
Then user receive a FAP calculation report 

		Examples:
		|companyname|FAPvalue|RATpercentage|salaryprojection|
		|Insight Tecnology|2|1|25000000|
		|Infinity|0,5|2|1000000000|
		|ShadowStalkers|5|3|50000000000|

