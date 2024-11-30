Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
	
    When I mix the following ingredients
	| NAME | QUANTITY | UNITS |
	| Flour | 1       | KG    |
	| Water | 0.65    | L     |
	| Salt  | 0.08    | KG    |
    
	Then my belly should growl
