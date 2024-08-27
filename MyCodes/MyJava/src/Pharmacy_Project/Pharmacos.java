package Pharmacy_Project;

public class Pharmacos {
    String namePharmaco;
    int quantityPharmaco;
    float pricePharmaco;
    Pharmacos(String namePharmaco, int quantityPharmaco, float pricePharmaco){
        this.namePharmaco = namePharmaco;
        this.quantityPharmaco = quantityPharmaco;
        this.pricePharmaco = pricePharmaco;
    }
    public void setNamePharmaco(String namePharmaco){
        this.namePharmaco = namePharmaco;
    }

    public void setQuantityPharmaco(int quantityPharmaco){
        this.quantityPharmaco = quantityPharmaco;
    }

    public void setPricePharmaco(float pricePharmaco){
        this.pricePharmaco = pricePharmaco;
    }

    public String getNamePharmaco(){
        return namePharmaco;
    }

    public int getQuantityPharmaco(){
        return quantityPharmaco;
    }

    public float getPricePharmaco(){
        return pricePharmaco;
    }

    @Override
    public String toString(){
        return String.format("| %-20s | %-10d | %-10.2f |", namePharmaco, quantityPharmaco, pricePharmaco);
    }


}
