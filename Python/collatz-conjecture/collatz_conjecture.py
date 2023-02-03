def steps(number):
    if number <= 0:
        raise ValueError("Only positive integers are allowed")
    
    if number == 1:
        return 0
    
    steps = 0
    current = number
    while current != 1:        
        current = (current / 2) if current % 2 == 0 else (current * 3 + 1)
        steps += 1
        
    return steps
            
        