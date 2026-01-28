def sum(a, b):
    return a + b


def diff(a, b):
    return a - b


def product(a, b):
    return a * b


def divide(a, b):
    return a / b


def test_sum():
    assert sum(10, 5) == 15


def test_diff():
    assert diff(10, 5) == 6


def test_product():
    assert product(7, 7) == 24


def test_divide():
    assert divide(20, 4) == 5
