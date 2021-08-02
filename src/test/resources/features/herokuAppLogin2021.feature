Feature: LogIn to heroku app

Background:
Given I have navigated to heroku login page


Scenario: Login to Heroku
When I enter username for heroku
And I enter password for heroku
And I submit the form
Then I should see heroku homepage

  @2021
  Example:Login to Heroku Again
    When I enter username for heroku
    And I enter password for heroku
    And I submit the form
    Then I should see heroku homepage


		