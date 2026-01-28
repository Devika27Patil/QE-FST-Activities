import pytest

def add(a, b) :
    return a + b 

def sub(a, b) :
    return a - b

def multiply(a, b) :
    return a * b

def divide(a, b) :
    return a / b

def test_add():
    assert add(10, 5) == 15


def test_sub():
    assert sub(10, 5) == 5

@pytest.mark.activity
def test_multiply():
    assert multiply(6, 4) == 24

@pytest.mark.activity
def test_divide():
    assert divide(20, 4) == 4
