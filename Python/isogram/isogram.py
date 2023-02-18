from collections import Counter

def is_isogram(string):
    if len(string) == 0: 
        return True
    
    counter = Counter(string.lower().replace('-', '').replace(' ', ''))
    
    return all(val == 1 for val in counter.values())

    
        
