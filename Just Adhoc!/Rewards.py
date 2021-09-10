class Shelve:

    def __init__(self, n: int, cups: list, medals: list):
        self._shelves = []
        self._cups = cups
        self._medals = medals
        self._atShelve = 0
        for index in range(n):
            self._shelves.append([])

    def populate_shelve_cups(self):
        for cup in self._cups:
            if len(self._shelves[self._atShelve]) <= 5:
                self._shelves[self._atShelve].append(cup)
            else:
                self._atShelve += 1
        self._atShelve += 1

    def populate_shelve_medals(self):
        for medal in self._medals:
            if len(self._shelves[self._atShelve]) <= 10:
                self._shelves[self._atShelve].append(medal)
            else:
                self._atShelve += 1
        self._atShelve += 1


if __name__ == '__main__':
    cups_list = ["c" for cups in input("Enter cups: ").split(" ") for cup in range(int(cups))]
    medals_list = ["m" for medals in input("Enter medals: ").split(" ") for medal in range(int(medals))]
    n = int(input("Enter shelve numbers: "))

    shelve = Shelve(n, cups_list, medals_list)

    try:
        shelve.populate_shelve_cups()
        shelve.populate_shelve_medals()
    except:
        print("NO")
    else:
        print("YES")
