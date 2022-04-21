
public enum ServiceType {

    TIRE_CHANGE(),
    OIL_CHANGE(),
    REPLACEMENT_OF_FILTERS();

    /* private int price;

     ServiceListE(int price) {
         this.price = price;
     }

     public int getPrice() {
         return price;
     }


     */
    public String serviceInfo() {
        return this + " ";

    }
}
