Feature: GreenKart buying some items

Scenario: User Select Vegetables

Given User Launch the url
When User Search Cucumber in Searchbox
And User click the add to cart button
And User click the items icon
And User click the Proceed to checkout button
Then Next Page loaded

Scenario: User Place order

When User enter a promo code
And User click a apply button
And User click a place order

Scenario: User Confirm the Order

When User Select a Country
And User click the agree button
And User click the proceed button