def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    
    if number < 1:
        raise ValueError('Classification is only possible for positive integers.')
    
    aliquot_sum = calculate_aliquot_sum(number)
    
    if isPerfect(aliquot_sum, number):
        return 'perfect'
    
    if isAbundant(aliquot_sum, number):
        return 'abundant'
    
    if isDeficient(aliquot_sum, number):
        return 'deficient'


def calculate_aliquot_sum(number):
    """ Returns the aliquot sum for the given positive integer
    
    :param number: int a positive integer
    :return: aliquot sum of the give integer
    """
    
    factors = []
    factor = 1
    
    while (factor != number):
        if number % factor == 0:
            factors.append(factor)
        factor += 1
    
    return sum(factors)


def isPerfect(aliquot_sum, number):
    """ Determines if the given positive integer is perfect
    
    :param number: int a positive integer
    :return: bool is number perfect?
    """
    
    return aliquot_sum == number


def isAbundant(aliquot_sum, number):
    """ Determines if the given positive integer is abundant
    
    :param number: int a positive integer
    :return: bool is number abundant
    """
    
    return aliquot_sum > number


def isDeficient(aliquot_sum, number):
    """ Determines if the given positive integer is deficient
    
    :param number: int a positive integer
    :return: bool is number abundant
    """
    
    return aliquot_sum < number
