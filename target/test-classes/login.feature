Feature: User can login to GIFBUZZ website
  Scenario Outline: User can login with valid credential
    Given User visited to the site
    When User enter valid credential "<username>" and "<password>"
    Then User can login to the site
    Examples:
      | username  | password |
    | hasnat.shoheb@gmail.com | 559959aA@ |
    | testnurad@gmail.com     | 559959aA@ |
    | nurad59@gmail.com       | 559959aA@ |
