public class Voiture {
    private String type;
    private String carburant;
    private int nombre_place;
    private int consommation;

    public Voiture(String type, String carburant, int nombre_place, int consommation) {
        this.type = type;
        this.carburant = carburant;
        this.nombre_place = nombre_place;
        this.consommation = consommation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getNombre_place() {
        return nombre_place;
    }

    public void setNombre_place(int nombre_place) {
        this.nombre_place = nombre_place;
    }

    public int getConsommation() {
        return consommation;
    }

    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }


    public void Consomme() {
        System.out.println("Consommation : "+consommation+" L/km du "+carburant);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "type='" + type + '\'' +
                ", carburant='" + carburant + '\'' +
                ", nombre_place=" + nombre_place +
                ", consommation=" + consommation +
                '}';
    }
}
