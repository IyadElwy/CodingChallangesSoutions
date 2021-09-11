if __name__ == '__main__':
    num_of_needed_rides, m_ticket_num_rides, one_ride_price, m_ride_price = input("Enter info: ").split(" ")
    num_of_needed_rides = int(num_of_needed_rides)
    budget = 0
    while int(num_of_needed_rides) > 0:
        if int(num_of_needed_rides) >= int(m_ticket_num_rides):
            x = 1
            cost = 0
            while x < int(m_ticket_num_rides):
                cost += int(one_ride_price)
                x += x
            if cost < int(m_ride_price):
                budget += int(one_ride_price)
                num_of_needed_rides -= 1
                print(cost, m_ride_price)
            else:
                budget += int(m_ride_price)
                num_of_needed_rides -= int(m_ticket_num_rides)
                print(cost, one_ride_price)
        else:
            budget += int(one_ride_price)
            num_of_needed_rides -= 1

    print(budget)
