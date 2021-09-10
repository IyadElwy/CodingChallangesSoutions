def get_result(a, b, c):
    num = a
    while True:
        if num == b:
            return True
        elif num > b:
            return False
        num += c


if __name__ == '__main__':
    user_input = input("Enter the 3 numbers: ")
    starting_num, num_to_search, skips = tuple(user_input.split(" "))

    if get_result(int(starting_num), int(num_to_search), int(skips)):
        print("Yes")
    else:
        print("No")
