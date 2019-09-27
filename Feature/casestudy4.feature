Feature: Cart situation

Scenario: the one where the user moves to cart without adding any
Given Alex has registered to the test me app
When alex search a particular product
And try to proceed to payment
Then testme app doesnt display the cart icon
