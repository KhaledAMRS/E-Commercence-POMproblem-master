Feature: user should be able to login to the system
  #Test Scenario 1
  Scenario:  user login with valid username and password
    And user navigates to login page
    When user login with "test@example.com" and "P@ssw0rd"
    And user click on login button
      #Expected result
  Then user could login successfully

    #Test Scenario 2
  Scenario:  user login with invalid username and password


    #SC1- User could register with valid data
    #SC2- User could log in with valid email and password
    #SC3- User could reset his/her password successfully
    #***Note**** in this case you just need to confirm that this message is displayed "Email with instructions has been sent to you."
    #SC4- Logged User could search for any product
    #SC5- Logged User could switch between currencies US-Euro
    #SC6- Logged user could select different Categories
    #***Note**** Select random category then hover and open sub-Category if found*
    #SC7- Logged user could filter with color
    #***Note**** in this case you should select specific category like Apparel > Shoes*
    #SC8- Logged user could select different tags
    #SC9- Logged user could add different products to Shopping cart
    #SC10- Logged user could add different products to Wishlist
    #SC11- Logged user could add different products to compare list
    #SC12- Create successful Order