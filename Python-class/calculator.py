print("-------------Calculator--------------")
num1= float(input("Enter first number: "))
op= input("Enter the operator: ")
num2= float(input("Enter second number: "))

if op=='+':
    result=num1+num2
    print(f"Result : {num1} + {num2} = {result}")
elif op=='-':
    result=num1-num2
    print(f"Result : {num1} - {num2} = {result}")
elif op=='*':
    result=num1*num2
    print(f"Result : {num1} * {num2} = {result}")
elif op=='/':
    if num2==0:
        print("Error: Division by zero is not allowed!")
    else:
         result=num1/num2
         print(f"Result : {num1} / {num2} = {result}")
else:
    print("Invalid Operator!")