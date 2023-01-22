def is_armstrong_number(number):
    num_digits = len(str(number))

    sum = 0
    for digit in str(number):
        sum += pow(int(digit), num_digits)
        
    return sum == number

def is_armstrong_number(number):
    stringified = str(number)
    num_digits = len(stringified)
    
    return number == sum([pow(int(digit), num_digits) for digit in stringified])