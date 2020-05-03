from pylab import *

mpl.rcParams['font.sans-serif'] = ['SimHei']

labels = ("red", "green", "blue", "yellow", "grey")
colors = ("red", "green", "blue", "yellow", "grey")

data = [10,20,30,20,20]

plt.pie(data, labels=labels, colors=colors, autopct='%1.0f%%')
plt.show()