def is_prime(n: int) -> bool:
    for i in range(2, n):
        if n % i == 0 and i != 0:
            return False
    return True


def get_all_primes(n: int) -> list:
    results = list()
    for i in range(2, n):
        if is_prime(i):
            results.append(i)
    return results


def get_sum_primes(results: list, n: int):
    for index1 in range(len(results)):
        for index2 in range(index1, len(results)):
            if index1 == index2:
                if sum([results[index1], results[index2]]) == n:
                    print(len([results[index1], results[index2]]))
                    print([results[index1], results[index2]])
            else:
                if sum(results[index1: index2+1]) == n:
                    print(len(results[index1: index2+1]))
                    print(results[index1: index2+1])


if __name__ == '__main__':
    n = int(input("input: "))
    get_sum_primes(get_all_primes(n), n)
