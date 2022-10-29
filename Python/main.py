from car import Car

if __name__ == "__main__" :
    car = Car()
    car.licence ="AOG344"
    car.driver="Jose Jose"
    print(vars(car))  #Imprime todo en formato diccionario json
    
    car2 = Car()
    car2.licence ="FOO355"
    car2.driver = "Dario"
    print(vars(car2))