class CardSet:
    def __init__(self, set_inp: str):
        self._card_set = list(set_inp)
        self._possible_combos = [(1, 12), (2, 6), (3, 4),
                                 (12, 1), (6, 2), (4, 3)]

    def _create_possibilities(self) -> list:
        result = []
        for a, b in self._possible_combos:
            single_combo = [(a, b)]
            b_temp = b
            for i in range(0, len(self._card_set), b):
                single_combo.append([x for x in self._card_set[i: b_temp]])
                b_temp += b
            result.append(single_combo)
        return result

    def get_winning_combos(self):
        all_combos = self._create_possibilities()
        winning_combos = []
        for combo in all_combos:
            for tpl in list(zip(*combo[1:])):
                if all(x == "X" for x in tpl):
                    winning_combos.append(combo[0])
                    break
        return winning_combos


if __name__ == '__main__':
    no_of_sets = int(input("Please enter no. of sets: "))
    card_sets = []
    for i in range(no_of_sets):
        card_sets.append(input("Enter set: "))

    for c_set in card_sets:
        result = CardSet(c_set).get_winning_combos()
        if len(result) <= 0:
            print(0)
        else:
            print(len(result), end=" ")
            for tpl in result:
                print(f"{tpl[0]}x{tpl[1]}", end=" ")
            print("\n")
