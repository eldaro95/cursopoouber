from car import Car

class Uberpool(Car):
    brand = str;
    model = str;
    
    #Aplicando herencia de Car
    def __init__(self,license,driver,brand,model):
        super().__init__(license,driver)
        self.brand = brand
        self.model = model
        