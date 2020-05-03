import numpy as numpy
import pandas as pd

amounts = {3,1,4,1,5,9}
labels = ["apple", "oranges", "pears", "cherries", "peaches", "coconuts"]

#series = pd.Series(amounts, index=labels, name="Amounts")
#print (series)

amounts = {
    "apple":3,
    "oranges":1,
    "pears":4,
    "cherries":1,
    "peaches":5,
    "coconuts":9
}

series = pd.Series(amounts, name="Amounts")
print(series)