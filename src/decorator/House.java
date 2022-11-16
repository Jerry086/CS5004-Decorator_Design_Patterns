package decorator;

/**
 * represents a House product.
 */
public class House extends RealEstate {

  /**
   * constructs a House product.
   */
  public House(){
    this.description = "House";
  }

  @Override
  public int getPrice() {
    return 2000000;
  }
}
