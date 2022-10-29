#Importar para usar herencia
from account import Account


class Car:
    id = int
    licence = str
    driver = Account("","") #Por herencia recibe lo de account
    passenger = int
    
    #Declarando el metodo constructor (init y self son obligatorios)
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
    
    #Campos obligatorios