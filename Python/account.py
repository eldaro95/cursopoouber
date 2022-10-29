class Account:
    id = int
    name = str
    document = str
    email = str
    password = str
    
    #Declarando el metodo constructor (init y self son obligatorios)
    def __init__(self, name, document):
        self.name = name
        self.document = document
        
    '''hace referencia a los datos que componen la clase,
    en este caso self.name está llamando al atributo name 
    que se encuentra en la línea 3 de la clase y, le está
    asignando el dato que se pasa en el método __init__ de la línea 8.
'''