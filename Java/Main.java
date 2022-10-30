class Main{
    public static void main(String[] args) {
        UberX uberx = new UberX("AMQ123",new Account("Pepe","160058431","elpepe@gmail.com"),"Chevrolet","Saint");
        uberx.passenger = 5;
        uberx.printDataCar();

        Car car2= new Car("AGG184",new Account("Juan","156606541","juanito@gmail.com"));
        car2.passenger=3;
        car2.printDataCar();
    }
}