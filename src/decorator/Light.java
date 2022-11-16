package decorator;

/**
 * represent a real estate with light decoration.
 */
public class Light extends RealEstateDecorator {

  /**
   * provides a real estate with light decoration.
   *
   * @param realEstate a real estate product.
   */
  public Light(RealEstate realEstate){
    this.realEstate = realEstate;
  }

  @Override
  public String getDescription() {
    return this.realEstate.getDescription() + ", light";
  }

  @Override
  public int getPrice() {
    return this.realEstate.getPrice() + 5000;
  }

}
