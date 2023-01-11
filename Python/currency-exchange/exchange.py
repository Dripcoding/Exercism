"""Functions for exchanging money"""


def exchange_money(budget, exchange_rate):
    """Exchange your money with the exchange rate

    :param budget: float - amount of money you are planning to exchange.
    :param exchange_rate: float - unit value of the foreign currency.
    :return: float - exchanged value of the foreign currency you can receive.
    """

    return budget / exchange_rate


def get_change(budget, exchanging_value):
    """Find how much money you have left over after exchanging

    :param budget: float - amount of money you own.
    :param exchanging_value: float - amount of your money you want to exchange now.
    :return: float - amount left of your starting currency after exchanging.
    """

    return budget - exchanging_value


def get_value_of_bills(denomination, number_of_bills):
    """Find the total value of the bills you have

    :param denomination: int - the value of a bill.
    :param number_of_bills: int - amount of bills you received.
    :return: int - total value of bills you now have.
    """

    return number_of_bills * denomination


def get_number_of_bills(budget, denomination):
    """Find the number of bills of the given denomination

    :param budget: float - the amount of money you are planning to exchange.
    :param denomination: int - the value of a single bill.
    :return: int - number of bills after exchanging all your money.
    """

    return int(budget / denomination)


def get_leftover_of_bills(budget, denomination):
    """Find the leftover amount of money that can't be exchanged for bills of the
    given denomination

    :param budget: float - the amount of money you are planning to exchange.
    :param denomination: int - the value of a single bill.
    :return: float - the leftover amount that cannot be exchanged given the current denomination.
    """

    return budget % denomination


def exchangeable_value(budget, exchange_rate, spread, denomination):
    """Find the maximum value of money you can get when exchanging for bills of the
    given denomination at the current exchange_rate and with the exchange fee percentage.

    :param budget: float - the amount of your money you are planning to exchange.
    :param exchange_rate: float - the unit value of the foreign currency.
    :param spread: int - percentage that is taken as an exchange fee.
    :param denomination: int - the value of a single bill.
    :return: int - maximum value you can get.
    """

    exchange_rate = (spread / 100) * exchange_rate + exchange_rate
    exchange_money_total = exchange_money(budget, exchange_rate)
    number_of_bills = get_number_of_bills(exchange_money_total, denomination)
    return get_value_of_bills(denomination, number_of_bills)
