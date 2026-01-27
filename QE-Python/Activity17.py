import pandas as pd

data = {
    "Usernames": ["Ritesh", "Devika", "Ritika"],
    "Passwords": ["r@7", "d@27", "rd@02"]
}

df = pd.DataFrame(data)

df.to_csv("users.csv", index=False)

print("CSV file created successfully!")
