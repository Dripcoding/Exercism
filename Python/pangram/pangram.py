import re
from collections import Counter
from string import ascii_lowercase

def is_pangram(sentence):
    sentence = sentence.lower()
    if sentence == "" or len(sentence) < 26:
        return False
    
    counter = Counter('abcdefghijklmnopqrstuvwxyz')
    sentence_counter = Counter(sentence)
    
    for letter in counter.keys():
        if sentence_counter[letter] == 0 \
            or letter not in sentence_counter.keys():
                return False
        
    return True

def is_pangram_solution2(sentence):
    alphabet = set(ascii_lowercase)
    
    return alphabet.issubset(alphabet)


def is_pangram_solution3(sentence):
    return all( letter in sentence.lower() for letter in ascii_lowercase)