# Score categories.
# Change the values as you see fit.
YACHT = 'YACHT'
ONES = 'ONES'
TWOS = 'TWOS'
THREES = 'THREES'
FOURS = 'FOURS'
FIVES = 'FIVES'
SIXES = 'SIXES'
FULL_HOUSE = 'FULL_HOUSE'
FOUR_OF_A_KIND = 'FOUR_OF_A_KIND'
LITTLE_STRAIGHT = 'LITTLE_STRAIGHT'
BIG_STRAIGHT = 'BIG_STRAIGHT'
CHOICE = 'CHOICE'


def score(dice, category):
    """Calculate the score of the dice for a category.
    
    :param dice: list of ints - 5 dice values
    :param category: string - game category 
    """
    
    if category == YACHT: return yacht_score(dice)
    elif category == ONES: return number_score(dice, 1)
    elif category == TWOS: return number_score(dice, 2)
    elif category == THREES: return number_score(dice, 3)
    elif category == FOURS: return number_score(dice, 4)
    elif category == FIVES: return number_score(dice, 5)
    elif category == SIXES: return number_score(dice, 6)
    elif category == FULL_HOUSE: return full_house_score(dice)
    elif category == FOUR_OF_A_KIND: return four_of_a_kind_score(dice)
    elif category == LITTLE_STRAIGHT: return little_straight_score(dice)
    elif category == BIG_STRAIGHT: return big_straight_score(dice)
    elif category == CHOICE: return choice_score(dice)

def number_score(dice, target):
    num_count = 0
    for num in dice:
        if num == target: num_count += 1
    return target * num_count
    
    
def full_house_score(dice):
    scores = {}
    for num in dice:
        if (num in scores): scores[num] += 1
        else:
            scores[num] = 1
    
    is_three = False
    is_two = False
    for values in scores.values():
        if values == 3: is_three = True
        elif values == 2: is_two = True
    
    return sum(dice) if is_three and is_two else 0
        

def four_of_a_kind_score(dice):
    scores = {}
    for num in dice:
        if (num in scores): scores[num] += 1
        else:
            scores[num] = 1
            
        if scores[num] == 4: return 4 * num
    return 0


def little_straight_score(dice):
    return 30 if (1 in dice and 2 in dice and 3 in dice and 4 in dice and 5 in dice) else 0


def big_straight_score(dice):
    return 30 if (2 in dice and 3 in dice and 4 in dice and 5 in dice and 6 in dice) else 0


def choice_score(dice):
    score = 0
    for num in dice:
        score += num
    return score


def yacht_score(dice):
    current = dice[0]
    for num in dice[1:]:
        if num != current: return 0
    return 50
