class Main{
    public static void main(String[] args) {
        UberX uberx = new UberX("AMQ123",new Account("Pepe","160058431","elpepe@gmail.com"),"Chevrolet","Saint");
        /*uberx.passenger = 5; Se encapsulo en la clase como private*/
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan van = new UberVan("AGG184",new Account("Juan","156606541","juanito@gmail.com"));
        /*car2.passenger=3; encapsulado*/
        van.setPassenger(6);
        van.printDataCar();
    }
}