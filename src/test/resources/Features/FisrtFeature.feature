Feature: Verificar Google home
  Scenario: Verificar si el campo Busqueda esta visible
    Given Home page is loaded
    And browser maximized
    Then account field is visible
    Then fill and create account
    Then log account
    Then click incomes button
    Then category field is visible
    Then fill and create category

  #Scenario: Verificar que el boton "Buscar" esta visible

  #Scenario: Verificar resultados de busqueda