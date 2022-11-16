package decorator;

/**
 * represent a real estate with fridge decoration.
 */
public class Fridge extends RealEstateDecorator {

  /**
   * provides a real estate with fridge decoration.
   *
   * @param realEstate a real estate product.
   */
  public Fridge(RealEstate realEstate){
    this.realEstate = realEstate;
  }

  @Override
  public String getDescription() {
    return this.realEstate.getDescription() + ", fridge";
  }

  @Override
  public int getPrice() {
    return this.realEstate.getPrice() + 3000;
  }
}
