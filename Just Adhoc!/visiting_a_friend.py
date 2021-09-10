class TeleportPath:
    def __init__(self, teleports: list, destination: int):
        self._teleports = teleports
        self._destination = destination

    def check_if_can_teleport(self):
        temp_limit = int(self._teleports[0][1])
        for start, limit in self._teleports[1:]:
            if int(start) <= temp_limit:
                temp_limit = int(limit)
                if int(self._destination) in range(int(start), int(limit) + 1):
                    return True
            else:
                return False
        return False


if __name__ == '__main__':
    teleports_tmp = []
    num_of_teleports, destination_tmp = input("Enter num of teleports and destination: ").split(" ")
    for i in range(int(num_of_teleports)):
        teleports_tmp.append(tuple(input("Enter teleport pos and limit: ").split(" ")))

    tele_path = TeleportPath(teleports_tmp, destination_tmp)
    print(tele_path.check_if_can_teleport())
