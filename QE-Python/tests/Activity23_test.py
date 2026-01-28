# import pytest

# @pytest.fixture
# def num_list():
#     return list(range(11))

def test_sum_list(num_list):
    assert sum(num_list) == 55

def test_sum_list2(num_list) :
    assert sum(num_list) == 50