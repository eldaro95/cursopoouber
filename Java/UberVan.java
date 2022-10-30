import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver) {
        super(license, driver);
    }   
    /*Cuando se requiere sobreescribir un metodo: Polimorfismo */
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger==6){
            this.passenger=passenger;
        } else {
            System.out.println("Debe tener 6 pasajeros");
        }
    }
}
