from matplotlib import pyplot as plt

x = ["Number of general colleges and universities", "number of general middle schools", "number of high schools",
     "Number of junior high schools", "number of vocational middle schools", "number of ordinary primary schools",
     "Number of special education schools", "number of preschool education schools"]

y_9 = [2305, 70774, 14607, 56167, 5805, 280184, 1672, 138209]

y_10 = [2358, 68881, 14058, 54823, 5273, 257410, 1706, 150420]

y_11 = [2409, 67751, 13688, 54063, 4856, 241249, 1767, 166750]

plt.figure(figsize=(10, 6.18), dpi=100)
bar_width = 0.25

x_9 = list(range(len(x)))
x_10 = list(i + bar_width for i in range(len(x)))
x_11 = list(i + bar_width*2 for i in range(len(x)))

plt.barh(x_9, y_9, height = bar_width, label="2009")
plt.barh(x_10, y_10, height = bar_width, label="2010")
plt.barh(x_10, y_10, height = bar_width, label="2011")

plt.legend()
plt.grid(alpha=0.5, linestyle = "--")
plt.yticks(x_10, x, fontsize=3.5)
plt.xlabel("Value")
plt.title("Schools from 2009, 2010, 2011")

plt.show()
