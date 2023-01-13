def equilateral(sides):
    """Determine if a triangle is equilateral. An equilateral triangle has all three sides the same length.
    
    :param sides - list containing the triangle sides' lengths
    
    :return: bool - is triangle equilateral
    """
    a, b, c = sides[0], sides[1], sides[2]
    all_sides_zero = (a == 0 or b == 0 or c == 0)
    all_sides_equal = a == b == c
    
    if all_sides_zero or not isTriangle(sides): return False
    return True if all_sides_equal else False


def isosceles(sides):
    """Determine if a triangle is isosceles. An isosceles triangle has at least 2 sides the same length.
    
    :param sides - list containing the triangle sides' lengths
    
    :return: bool - is triangle isosceles
    """
    a, b, c = sides[0], sides[1], sides[2]
    if not isTriangle(sides): return False
    elif equilateral(sides): return True
    elif a == b or b == c or a == c: return True
    return False


def scalene(sides):
    """Determine if a triangle is scalene. A scalene triangle has all sides of different lenghts.
    
    :param sides - list containing the triangle sides' lengths
    
    :return: bool - is triangle scalene
    """
    a, b, c = sides[0], sides[1], sides[2]
    all_sides_not_equal = (a != b and a != c and b != c)
    if not isTriangle(sides): return False
    return True if all_sides_not_equal else False

def isTriangle(sides):
    """Determine if the sides comprise a triangle.
    
    :param sides - list containing a potential triangle's side lenghts
    
    :return: bool - is a valid triangle
    """
    a, b, c = sides[0], sides[1], sides[2]
    return (a + b >= c) and (b + c >= a) and (a + c >= b)
