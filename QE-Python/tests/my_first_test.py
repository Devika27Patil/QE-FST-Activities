"""
To run we have to run the command (pytest) in terminal
Rules :
1. Tests must be in the ./tests folder
2. Test files SHOULD start or end with "test"
3. Test fnctions SHOULD start with "test"
"""

"""
To run specific file : pytest tests/file-name
to run specific function : pytest -k substring matching means it will search all the names and try to match that substring 
pytest -k substring name (ex. add then all add substring functions will run)
"""

import math 

def test_sqrt() :
    num = 25
    # assertation is to use validatng the elements left right side(validations)
    assert math.sqrt(num) == 5    

def testsquare () :
    num = 7 
    assert num * num == 49

def testquality() :
    assert 10 == 11

