def string_analyzer(text):
    vowels= "aeiouAEIOU"
    vowel_count=0

    for char in vowels:
        if char in text:
            vowel_count+=1

    cleaned_text=text.replace(" ","").lower()
    is_palindrome = cleaned_text==cleaned_text[::-1]

    print(f"No. of vowels:{vowel_count}")
    if is_palindrome:
        print("It is a palindrome!")
    else:
        print("Not a palindrome!")
#Main Program
print("---String Manipulation---")
user_input =input("Enter a word or a sentence: ")
string_analyzer(user_input)