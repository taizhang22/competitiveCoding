import numpy as np
import pandas as pd
#1. Pandas are used for organizing data.
#2. Series is a single index, whereas a data frame is multiple.
#3. In a series, each value has a defined index.
#4. pd.DataFrame() - it accepts series and data frames.
#5. ((df["column name"]).to_string(index=False))
#6. df.loc[df["column name"] condition]
#7. df.describe()


d = {"Item ID": {'2001':'2001', '2002':'2002', '2003':'2003', '2004':'2004'},
     "Item Name": {'2001': 'Pencil', '2002': 'Eraser', '2003': 'Ruler', '2004':'Fountain Pen'},
     "Week 1": {'2001': 50,'2002': 80, '2003': 30, '2004': 20},
     "Week 2": {'2001': 42,'2002': 65, '2003': 21, '2004': 25},
     "Week 3": {'2001': 68,'2002': 63, '2003': 47, '2004': 29}}

df = pd.DataFrame(d)

df2 = df.loc[df["Item Name"] =='Ruler']

df3 = ((df["Week 1"]).to_string(index=False))

df4 = df.loc[df["Item ID"] =='2004', ["Week 3"]]

df5 = df.sort_values(by=["Week 2"])

df6 = df.sort_values(by=["Item Name"])

df7 = df.describe()
print(df7)

