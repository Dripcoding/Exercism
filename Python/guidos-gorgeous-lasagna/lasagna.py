"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language: https://en.wikipedia.org/wiki/Guido_van_Rossum
"""

EXPECTED_BAKE_TIME = 40

PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(layers):
    """Calculate the time it takes to prepare n layers.
    :param layers: int - number of layers in lasagna.
    :return: int - total minutes of preparation derived from 'PREPARATION_TIME'
    Function that takes the number of layers the lasagna and returns the time it takes to
    prepare all layers.
    """
    return layers * PREPARATION_TIME


def elapsed_time_in_minutes(prep_time, bake_time):
    """Calculates the total cooking time for the lasagna.
    :param prep_time: int - total time to prepare lasagna
    :param bake_time: int - total baking time
    Function that sums the preparation and the baking time.
    """
    return prep_time * 2 + bake_time