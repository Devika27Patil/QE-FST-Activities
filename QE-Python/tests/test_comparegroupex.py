"""
to run grouping pytest : pytest -m group2 -v

pytest.ini
this file is created in the base project file to detetct the 
custom markes that we have created that all should be keep in this file
"""


import pytest

@pytest.mark.group1
def test_greater() :
    x =2
    y = 3
    assert y > x

@pytest.mark.group2
def test_greater_equal() :
    x = 3
    y = 3
    assert x >= y

@pytest.mark.group3
def test_lesser() :
    x = 4
    y = 2
    assert y < x
