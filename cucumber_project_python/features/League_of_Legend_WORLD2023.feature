
Feature: On test la BD des games de LNG vs T1 lors des worlds de LoL

  Scenario Outline: On veut vérifier le rôle des joueurs
    Given le joueur est <joueur>
    When je demande son rôle
    Then Il faudrait me dire <role>

      Examples:
      | joueur           | role |
      | T1 Faker         | MID  |
      | T1 Keria         | SUP  |
      | T1 Oner          | JGL  |
      | T1 Zeus          | TOP  |
      | T1 Gumayusi      | ADC  |
