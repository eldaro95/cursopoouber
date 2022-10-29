from car import Car
from account import Account

if __name__ == "__main__" :
    car = Car("ASG1024", Account("Pepe Grillo","187555001"))
    print(vars(car))
    print(vars(car.driver))