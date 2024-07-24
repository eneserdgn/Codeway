@terms_policy
Feature: Terms and Privacy Policy Page

  @elements
  Scenario: Verify Elements on Terms and Privacy Policy Page
    # Requirement: Verify that all elements are displayed correctly on the Terms and Privacy Policy Page
    Given I navigate to the Terms And Privacy Policy Page
    Then I should see Title: "Terms of Use and Privacy Policy" on the Terms And Privacy Policy Page
    And I should see Sub Title: "Please, accept the Terms of Use and Privacy Policy to continue." on the Terms And Privacy Policy Page
    And I should see Terms Of Use: "I have read, understood and accept the " on the Terms And Privacy Policy Page
    And I should see Privacy Policy: "I have read, understood and accept the " on the Terms And Privacy Policy Page
    And I should see inactive Continue Button on the Terms And Privacy Policy Page

  @terms_use
  Scenario: Verify Continue Button Remains Inactive When Only Terms of Use is Clicked
    # Requirement: Verify that the Continue Button remains inactive when only the Terms of Use is clicked
    Given I navigate to the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    Then I should see inactive Continue Button on the Terms And Privacy Policy Page

  @privacy_policy
  Scenario: Verify Continue Button Remains Inactive When Only Privacy Policy is Clicked
    # Requirement: Verify that the Continue Button remains inactive when only the Privacy Policy is clicked
    Given I navigate to the Terms And Privacy Policy Page
    When I click Privacy Policy Button on the Terms And Privacy Policy Page
    Then I should see inactive Continue Button on the Terms And Privacy Policy Page

  @activation
  Scenario: Verify Continue Button Activation After Clicking Both Terms of Use and Privacy Policy Buttons
    # Requirement: Verify that the Continue Button is activated after clicking both the Terms of Use and Privacy Policy buttons
    Given I navigate to the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    And I click Privacy Policy Button on the Terms And Privacy Policy Page
    Then I should see activated Continue Button on the Terms And Privacy Policy Page

  @navigation
  Scenario: Verify Navigation to Welcome Page After Clicking Activated Continue Button
    # Requirement: Verify navigation to the Welcome page after clicking the activated Continue Button
    Given I navigate to the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    And I click Privacy Policy Button on the Terms And Privacy Policy Page
    And I click activated Continue Button on the Terms And Privacy Policy Page
    Then I should see the Welcome To Wonder Page

  @sanity
  Scenario: Verify Complete Workflow of Terms and Privacy Policy Page
    # Requirement: Verify the complete workflow of the Terms and Privacy Policy Page
    Given I navigate to the Terms And Privacy Policy Page
    Then I should see Title: "Terms of Use and Privacy Policy" on the Terms And Privacy Policy Page
    And I should see Sub Title: "Please, accept the Terms of Use and Privacy Policy to continue." on the Terms And Privacy Policy Page
    And I should see Terms Of Use: "I have read, understood and accept the " on the Terms And Privacy Policy Page
    And I should see Privacy Policy: "I have read, understood and accept the " on the Terms And Privacy Policy Page
    And I should see inactive Continue Button on the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    Then I should see inactive Continue Button on the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    When I click Privacy Policy Button on the Terms And Privacy Policy Page
    Then I should see inactive Continue Button on the Terms And Privacy Policy Page
    When I click Terms Of Use Button on the Terms And Privacy Policy Page
    Then I should see activated Continue Button on the Terms And Privacy Policy Page
    When I click activated Continue Button on the Terms And Privacy Policy Page
    Then I should see the Welcome To Wonder Page
