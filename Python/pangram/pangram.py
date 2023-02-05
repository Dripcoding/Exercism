import re
from collections import Counter

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
    
    