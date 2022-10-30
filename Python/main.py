from car import Car
from account import Account
from uberblack import UberBlack
from uberx import UberX

if __name__ == "__main__" :
    car = Car("ASG1024", Account("Pepe Grillo","187555001"))
    print(vars(car))
    print(vars(car.driver))
    
    uberx= UberX("FIUG887",Account("Maria Juarez","1958666944"),"Mercedez","CLA")
    print(vars(uberx))
    
    uberlujo=UberBlack("GII9870",Account("John Salchichon","956858493054"),"Mustang","V1")
    print(vars(uberlujo))