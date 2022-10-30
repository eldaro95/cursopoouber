class Main{
    public static void main(String[] args) {
        UberX uberx = new UberX("AMQ123",new Account("Pepe","160058431","elpepe@gmail.com"),"Chevrolet","Saint");
        /*uberx.passenger = 5; Se encapsulo en la clase como private*/
        uberx.setPassenger(3);
        uberx.printDataCar();

        UberPool car2= new UberPool("AGG184",new Account("Juan","156606541","juanito@gmail.com"),"Audi","V2");
        /*car2.passenger=3; encapsulado*/
        car2.setPassenger(4);
        car2.printDataCar();
    }
}