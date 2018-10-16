//An aggregate (composite) class definition for a House

public class House {

    private String address, type, owner;
    private double price;

    /**Aggregate (composite) class that contains a
     nested Weight object as an attribute*/

    private Weight startWgt; //nested object
    

    //No argument constructor
    public House() {

        this.address = "No Address Specialfied";
        this.type = "No type Specialfied";
        this.price = 0.0;
        this.owner = "No owner specified";
        startWgt = new Weight ();

    }



    //Four argument constructor
    public House(String address, String type, String owner, double price ,int stones,int pounds) {

        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
        startWgt = new Weight ( stones, pounds );
    }

    //Accessor methods

    public void setStartWeight(int stones, int pounds){
        startWgt.setWeight(stones,pounds);
    }

    private void setWeight(int stones, int pounds) {
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void setOwner(String owner) {

        this.owner = owner;
    }

    //Mutator methods

    public Weight getStartWeight() {

        return startWgt;
    }

    public String getAddress() {

        return address;
    }

  public String getType() {

        return type;
    }

    public double getPrice() {

        return price;
    }

    public String getOwner() {

        return  owner;
    }

    //Constructor method
    @Override
    public String toString(){
        return "Address: " + getAddress() + "\nType: " + getType() +
                "\nPrice: " + getPrice() + "\nOwner: " + getOwner() +
                "\nStarting weight: " + startWgt.toString() ;
    }
}

