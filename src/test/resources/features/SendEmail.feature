Feature: Send Email
 #	Passing the content and dynamic value over it
  Scenario Outline: Send email to suer
    Given user must launch the application
    When User should send email to register
"""
Hello  <user>

Welcome to our community !...

Click on the below link for registration ...
From Support team

"""

    Examples: 
      |user|
      |testUser1|
      |testUser2|
