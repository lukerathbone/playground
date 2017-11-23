Feature: Schedule a campaign

  In order to send bulk email campaigns
  As a marketer
  I want to schedule a campaign

  Scenario: Saving a Campaign
    Given Mike is creating a new Campaign
    When he "Saves" the Campaign
    Then the Campaign is saved in the "Draft" state