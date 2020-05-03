from matplotlib import pyplot as plt

x = ["August", "September", "October", "November", "December", "January", "Febuary", "March", "April", "May"]

y = [10,10,30,30,20,50,30,10,40,30]
plt.plot(x,y, marker='o', color="blue")
plt.grid(alpha=0.5)
plt.xticks(rotation=45)
plt.xlabel("Month")
plt.ylabel("Weight(kg)")
plt.title("Scooter the puppy's weight")
plt.ylim(0,55)
plt.xlim(0,len(x))

ax = plt.gca()
ax.set_aspect('auto')

plt.plot(x,y)
plt.show()