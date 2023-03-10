Feature: Testing search functionality as a Guest

  Scenario: Search for the term create-react-app
    Given User visits the portal
    When User inputs create-react-app in search input
    Then User finds related  matching result


  Scenario: find and verify "facebook/create-react-app " project as the first result
    Given User visits the portal
    When User inputs create-react-app in search input
    Then User find facebook/create-react-app project as the first result

  Scenario: Verify About button on landing page footer
    Given User visits the portal
    When Go to landing page footer and click about button
    Then User will be taken to the GitHub About page.



