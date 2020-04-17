#Author: your.email@your.domain.com
#Keywords Summary :


@ReportSanity
Feature: Login Report

Scenario: Verify Login Report is Loading
Given User Navigates to Login Report
Then Login Report Should load


Scenario: Verify filters can be applied in Login Report
Given User Navigates to Login Report
When User applies filters in Login report
Then Login Report Should load as per the filters
