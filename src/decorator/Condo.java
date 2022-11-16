package decorator;

/**
 * represents a Condo product.
 */
public class Condo extends RealEstate {

  /**
   * constructs a Condo product.
   */
  public Condo(){
    this.description = "Condo";
  }

  @Override
  public int getPrice() {
    return 800000;
  }
}
