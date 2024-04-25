Feature: Create account functionality

  Scenario: Positive scenario to create an account
    Given user is on main page of Luma user clicks on create account link
    Then user enters firstname and lastname as follows
      | firstName | Thomas |
      | lastname  | Shelby |
    And user enters email and password as follows
      | email    | thomas@fff.com |
      | password | ZXCVBNm!2$        |
    Then user confirms entered password as follows
      | confirmPassword | ZXCVBNm!2$ |
    And user clicks on create account button
    Then user validates success message as follows
      | successMessage | Thank you for registering with Main Website Store. |