# language: fr

Fonctionnalité: : C'est déjà ?
  je veux vraiment savoir si aujourd'hui c'est vendredi

  Plan du scénario: Aujourd'hui c'est vendredi ?
    Etant donné Aujourd'hui c'est "<jour>"
    Quand Je demande c'est quand Vendredi
    Alors Il faudrait me dire "<reponse>"

    Exemples:
      | jour           | reponse |
      | Friday         | TGIF    |
      | Sunday         | Non     |
      | anything else! | Non     |


