import math
import os
import random
import re
import sys

if __name__ == '__main__':
    try:
        n = int(input().strip())
    except EOFError:
        # no input given
        n = 0  # or handle as needed

    if n % 2 != 0:
        print("Weird")
    elif n in range(2, 6):
        print("Not Weird")
    elif n in range(6, 21):
        print("Weird")
    else:
        print("Not Weird")
