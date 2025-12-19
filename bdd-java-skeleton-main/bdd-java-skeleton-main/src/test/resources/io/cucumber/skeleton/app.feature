Feature:

  Scenario: 1 livre coute 8$
    Given une boutique de livre
    When j'ajoute le tome 1 au panier
    Then Le prix total est de 8$

  Scenario: 2 livres differents
    Given une boutique de livre
    When j'ajoute le tome 1 au panier
    When j'ajoute le tome 2 au panier
    Then Le prix total est de 15.2$

    