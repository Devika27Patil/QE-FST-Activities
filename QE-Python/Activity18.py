import pandas as pd

df = pd.read_csv("users.csv")

print("Usernames column:")
print(df["Usernames"])
print()

print("Second row (Username and Password):")
print(df.loc[1, ["Usernames", "Passwords"]])
print()

print("Usernames sorted in ascending order:")
print(df.sort_values("Usernames"))
print()

print("Passwords sorted in descending order:")
print(df.sort_values("Passwords", ascending=False))
