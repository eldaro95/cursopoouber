class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar() {
        if (passenger != null){
        System.out.println("\nLicence: " + license + "\nName Driver: " + driver.name + "\nPassengers: " + passenger);
        } else {
            System.out.println("");
        }
    }

    /*Forma de poder llamar los datos privados en una clase hija */
    public Integer getPassenger() {
        return passenger;
    }
    /*Sirver para establecer condiciones de validación de una variable */
    public void setPassenger(Integer passenger){
        if(passenger>=4){
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar un numero mayor a 4 de pasajeros");
        }
        
    }
}
