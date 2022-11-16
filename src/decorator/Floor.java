package decorator;

/**
 * represent a real estate with floor decoration.
 */
public class Floor extends RealEstateDecorator {

  /**
   * provides a real estate with floor decoration.
   *
   * @param realEstate a real estate product.
   */
  public Floor(RealEstate realEstate){
    this.realEstate = realEstate;
  }

  @Override
  public String getDescription() {
    return this.realEstate.getDescription() + ", floor";
  }

  @Override
  public int getPrice() {
    return this.realEstate.getPrice() + 10000;
  }
}
