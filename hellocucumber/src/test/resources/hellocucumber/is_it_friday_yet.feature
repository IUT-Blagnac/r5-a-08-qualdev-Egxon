Feature: C'est déjà vendredi ?
  Tout le monde veut savoir c'est quand vendredi

  Scenario: Dimanche c'est pas vendredi
    Given Aujourd'hui c'est Dimanche
    When je demande si c'est déjà vendredi
    Then On devrais me dire Nope


Feature: C'est déjà vendredi ?
  Tout le monde veut savoir c'est quand vendredi

  Scenario Outline: Dimanche c'est pas vendredi
    Given Aujourd'hui c'est Dimanche
    When je demande si c'est déjà vendredi
    Then On devrais me dire "TGIF"
    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |