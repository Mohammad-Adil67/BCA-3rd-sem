def generate_table(n):
    """Generate a multiplication table for the given number n."""
    for i in range(1,11):
        print(f"{n} x {i} = {n * i}")

print("-----Loop and Function Lab-----")

number=int(input("Enter the number for generating multiplication table: "))

generate_table(number)