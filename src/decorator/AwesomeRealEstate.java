package decorator;

public class AwesomeRealEstate {

  public static void main(String[] args){

    RealEstate house = new House();
    System.out.println(house.getDescription() + ": $" + house.getPrice());

    RealEstate townhouse = new Townhouse();
    townhouse = new Floor(townhouse);
    townhouse = new Light(townhouse);
    System.out.println(townhouse.getDescription() + ": $" + townhouse.getPrice());

    RealEstate condo = new Condo();
    condo = new Fridge(condo);
    condo = new Fridge(condo);
    System.out.println(condo.getDescription() + ": $" + condo.getPrice());
  }

}
