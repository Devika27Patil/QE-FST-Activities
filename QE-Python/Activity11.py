fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150,
    "grapes": 90
}

name = input("Enter a fruit name: ").lower()

if name in fruits:
    print(f"{name} is available. Price: ₹{fruits[name]}")
else:
    print(f"{name} is not available.")
