class Main{
    public static void main(String[] args) {
        Car carro1 = new Car("AMQ123",new Account("Pepe","160058431","elpepe@gmail.com"));
        carro1.passenger = 5;
        carro1.printDataCar();

        Car car2= new Car("AGG184",new Account("Juan","156606541","juanito@gmail.com"));
        car2.passenger=3;
        car2.printDataCar();
    }
}