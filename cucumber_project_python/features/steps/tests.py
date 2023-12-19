from behave import *
import sqlite3




@given("le joueur est {joueur}")
def le_joueur_est_joueur(context, joueur):
    print(joueur)
    context.player_lol = joueur


@when("je demande son rôle")
def getRole(context):
    conn = sqlite3.connect("tab.db", check_same_thread=False)
    cur = conn.cursor()
    req = ("select role from player where name ='%s' ") % context.player_lol
    player_role = cur.execute(req)
    context.player_role = player_role.fetchall()[0][0]
    print(context.player_role)


@then("Il faudrait me dire {role:w}")
def getRes(context,role):

    assert (str(role) == str(context.player_role))
