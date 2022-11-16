package decorator;

/**
 * represents a Townhouse product.
 */
public class Townhouse extends RealEstate {

  /**
   * constructs a Townhouse product.
   */
  public Townhouse(){
    this.description = "Townhouse";
  }

  @Override
  public int getPrice() {
    return 1500000;
  }
}
