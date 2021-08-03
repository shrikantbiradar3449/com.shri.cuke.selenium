Feature: LogIn to heroku app

Background:
Given I have navigated to heroku login page


Scenario: Login to Heroku SC01

  When I enter username for heroku
  And I enter password for heroku
  And I submit the form
  Then I should see heroku homepage
#By Providing Test Data Sheet Name
  And DataDriven_I provide the following information in the detail page from excel file "testDataSheetPath"
#  By Providing column name
  And Select shipnode as "Severity" from results and click on Submit


#  @2021
#  Example:Login to Heroku Again
#    When I enter username for heroku
#    And I enter password for heroku
#    And I submit the form
#    Then I should see heroku homepage
#
#
#