def analyze_grades():
    print("-----BCA Student Marks Analyzer-----")
    #Creating an empty list for marks
    marks = []

    #Taking input for 5 subjects

    for i in range(1,6):
        score=float(input(f"Eneter the marks for subject{i}: "))
        marks.append(score)

    total=sum(marks)
    avg=total/len(marks)
    highest=max(marks)

    print("\n-----Performance Report-----")
    print(f"Total Marks:{total}/500")
    print(f"Average Percentage:{avg:.2f}%")
    print(f"Highest Score:{highest}")

    if avg>=40:
        print("Passed")
    else:
        print("Failed")

analyze_grades()