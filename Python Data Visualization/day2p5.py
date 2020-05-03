from matplotlib import pyplot as plt
import matplotlib.ticker as ticker

x = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]

y = [10, 10, 10, 9, 7]

plt.plot(x,y, marker='o', color = 'green')
plt.grid(alpha=0.5)
plt.xticks(rotation=45)
plt.xlabel("Day")
plt.ylabel("Price")
plt.title("Scooter the puppy's stock prices")
plt.ylim(5,11)
plt.xlim(0,len(x) - 0.5)

ax = plt.gca()
ax.yaxis.set_major_formatter(ticker.FormatStrFormatter("$%1.2f"))
ax.set_aspect('auto')

plt.plot(x,y)
plt.show()