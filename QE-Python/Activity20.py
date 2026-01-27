import pandas as pd

df = pd.read_excel("contacts.xlsx")

rows, columns = df.shape
print("No of rows:",rows)
print("No of columns:",columns)

print("\nEmails column:")
print(df["Email"])

sorted = df.sort_values(by="FirstName", ascending=True)
print("\nData Sorted by Firstname:")
print(sorted)