def leap_year(year):
    """Determine if a given year is a leap year in the Gregorian calendar
    
    :param year: int - the given year to evaluate
    :return: bool - is the given year a leap year?
    """
    if year % 4 == 0:
        if year % 100 == 0 and year % 400 == 0:
            return True
        elif year % 100 != 0:
            return True
    return False