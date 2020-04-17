#Author:nagarjun.reddy@simplify360.com
#Keywords Summary : Profile Creation Scenarios
Feature: Creating Listening Profile

  #Tested
  @Regression
  Scenario: Create Listening Profile with out Name and Volume
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    When User Clicked on Create with out Name and Volume
    Then Error message to enter the mandatory details should be displayed

  #Tested
  Scenario: Enable Case Association in Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    When User Enables the Case Association
    And Selects Case Association Duration
    And Save the Profile Settings
    And Save a Keyword Set
    Then Case Association Should be Saved with the selected duration

  #Tested
  Scenario: Select Reply options in Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    When User selects the Reply option
    And Save the Profile Settings
    And Save a Keyword Set
    Then Reply Settings should be saved with Selected Option

  #Tested
  Scenario: Create Keyword Profile With one Keyword Set
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When Save a Keyword Set
    Then Profile Should be Created with the keywords Added

  Scenario: Delete Profile SubQuery from Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Save a Keyword Set
    And Save another Keyword Set
    When User Deletes the Subquery
    Then Subquery Should be Deleted

  Scenario: Import Facebook Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Facebook Page
    Then Imported Facebook Page Should be Added to the Profile

  #Tested
  Scenario: Add Admin Facebook Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Facebook Page
    Then Added Admin Facebook Page Should be added

  Scenario: Add Non-Admin Admin Facebook Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Non-Admin Facebook Page
    Then Added Admin Facebook Page Should be added

  Scenario: Import Twitter Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Twitter Channel
    Then Imported Twitter Channel Should be Added to the Profile

  #Tested
  @Regression
  Scenario: Add Admin Twitter Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Twitter Channel
    Then Added Admin Twitter Channel Should be added

  Scenario: Add Non-Admin Admin Twitter Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Non-Admin Twitter Channel
    Then Added Admin Twitter Channel Should be added

  Scenario: Import Facebook Group to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Facebook Group
    Then Imported Facebook Group Should be Added to the Profile

  Scenario: Add Admin Facebook Group to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin Facebook Group
    Then Added Admin Facebook Group Should be added

  Scenario: Import YouTube Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an YouTube Channel
    Then Imported YouTube Channel Should be Added to the Profile

  #Tested
  @Regression
  Scenario: Add Admin YouTube Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin YouTube Channel
    Then Added Admin YouTube Channel Should be added

  Scenario: Add Non-Admin Admin YouTube Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin YouTube Channel
    Then Added Admin YouTube Channel Should be added

  Scenario: Import Tumblr Blog to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Tumblr Blog
    Then Imported Tumblr Blog Should be Added to the Profile

  Scenario: Add Admin Tumblr Blog to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin Tumblr Blog
    Then Added Admin Tumblr Blog Should be added

  Scenario: Import Linkedin Company Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Linkedin Company Page
    Then Imported Linkedin Company Page Should be Added to the Profile

  #Tested
  @Regression
  Scenario: Add Admin Linkedin Company Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Linkedin Company Page
    Then Added Admin Linkedin Company Page Should be added

  Scenario: Import Instagram Personal Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Instagram Personal Channel
    Then Imported Instagram Personal Channel Should be Added to the Profile

  #Tested
  Scenario: Add Admin Instagram Personal Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Personal Instagram Channel
    Then Added Admin Instagram Personal Channel Should be added

  Scenario: Add Non-Admin Admin Instagram Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin Instagram Channel
    Then Added Admin Instagram Channel Should be added

  Scenario: Import Instagram Business Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Instagram Business Channel
    Then Imported Instagram Business Channel Should be Added to the Profile

#Tested
  Scenario: Add Admin Instagram Business Channel to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Business Instagram Channel
    Then Added Admin Instagram Business Channel Should be added

  Scenario: Import Google Plus Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Google Plus Page
    Then Imported Google Plus Page Should be Added to the Profile

  Scenario: Add Admin Google Plus Page to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    And Skips Keyword Listening
    When User Add Admin Google Plus Page
    Then Added Admin Google Plus Page Should be added

  Scenario: Import WeChat Account to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an WeChat Account
    Then Imported WeChat Account Should be Added to the Profile

  Scenario: Add Admin WeChat Account to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin WeChat Account
    Then Added Admin WeChat Account Should be added

  Scenario: Import Google Play App to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Google Play App
    Then Imported Google Play App Should be Added to the Profile

  Scenario: Add Admin Google Play App to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User Add Admin Google Play App
    Then Added Admin Google Play App Should be added

  Scenario: Import Itunes App to Listening Profile
    Given User is Logged in As Admin/Owner
    And User open Profile Creation Screen from Listen Home
    And User Provides Name and Volume
    And Save the Profile Information
    And Save Profile Settings
    When User imports an Itunes App
    Then Imported Itunes App Should be Added to the Profile
