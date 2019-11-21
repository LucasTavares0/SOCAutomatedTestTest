#Author: lucas.s_tavares@hotmail.com

#SOC Blog Homepage URL <https://ww2.soc.com.br/blog/>

Feature: Test the Search functionality on SOC Blog homepage

Scenario: User searchs using a filter that refers to an existent content 

Given user is on the blog home page
When user enters a filter value that refers to an existent content
And user clicks on the search button
And user select a content result
And user clicks on the content result selected
Then user validates that content refers to the filter used

Scenario: User searchs using a filter that does not refers to an existent content

Given user is on the blog home page
When user enters a filter value that does not refers to an existent content
And user clicks on the search button
Then user receives erro message informing that no content refers to the filter used
