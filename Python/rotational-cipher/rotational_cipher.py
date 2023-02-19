def rotate(text, key):
    if key == 0 or key == 26:
        return text
    
    return ''.join(rotate_char(char, key) for char in text)


def rotate_char(char, key):
    if not char.isalpha():
        return char
    elif char.isupper():
        return rotate_upper_case(char, key)
    elif char.islower():
        return rotate_lower_case(char, key)
    
    
def rotate_lower_case(char, key):
    code = ord(char) + key 
    code_z = ord('z')
    if code > code_z:
        return chr(ord('a') + (code - code_z) - 1)
    return chr(code)


def rotate_upper_case(char, key):
    code = ord(char) + key
    code_upper_z = ord('Z')
    if code > code_upper_z:
        return chr(ord('A') + (code - code_upper_z) - 1)
    return chr(code)