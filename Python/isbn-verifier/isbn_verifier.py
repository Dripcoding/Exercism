from string import ascii_uppercase
from re import match

def is_valid(isbn):
    isbn = isbn.replace('-', '')
    if not validate_isbn(isbn):
        return False
    
    isbn_sum = 0
    for idx, char in enumerate(isbn):
        char_value = 0
        if char.isalpha() and char != 'X':
            return False
        elif char.isdigit():
            char_value = int(char)
        elif char == 'X' and idx == len(isbn) - 1:
            char_value = 10
        else:
            return False
            
        isbn_sum += char_value * (len(isbn) - idx)
        
    return isbn_sum % 11 == 0
        

def is_valid_with_regex(isbn):
    isbn = (isbn or '').replace('-', '')
    regex = r'^\d{9}[\dX]$'
    if not match(regex, isbn):
        return False
    
    digits = [(d == 'X' and 10) or int(d) for d in isbn]
    return sum(d * (10 - i) for i, d in enumerate(digits)) % 11 == 0

    
def validate_isbn(isbn):
    length = len(isbn)
    uppercase = set(ascii_uppercase)
    uppercase.remove('X')
    return False if length == 0 or length != 10 or isbn[-1] in uppercase \
        else True