import sqlite3

conn = sqlite3.connect("tab.db", check_same_thread=False)
cur = conn.cursor()

player_lol = ""
player_role = ""



print("hugo")
player_role = cur.execute("SELECT * FROM player")
print(player_role.fetchall())