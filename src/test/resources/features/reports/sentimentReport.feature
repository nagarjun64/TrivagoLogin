#Author: nagarjun.reddy@simplify360.com
#Keywords Summary :

@ReportSanity
Feature: Sentiment Report


Scenario: Verify Sentiment Report is Loading
Given User Navigates to Sentiment Report
Then Sentiment Report Should load


Scenario: Verify filters can be applied in Sentiment Report
Given User Navigates to Sentiment Report
When User applies filters in Sentiment report
Then Sentiment Report Should load as per the filters