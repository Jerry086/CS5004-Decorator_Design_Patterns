package decorator;

/**
 * represents a real estate product.
 */
public abstract class RealEstate {

  protected String description;

  /**
   * returns a description of the real estate product.
   *
   * @return a description of the real estate product.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * returns the total price of the real estate product.
   *
   * @return the total price of the real estate product.
   */
  public abstract int getPrice();

}
