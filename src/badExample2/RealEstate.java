package badExample2;

/**
 * represents a real estate product.
 */
public abstract class RealEstate {

  protected String description;
  protected boolean hasFloor = false;
  protected boolean hasFridge = false;
  protected boolean hasLight = false;

  /**
   * returns a description of the real estate product.
   * @return a description of the real estate product.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * returns the total price of the real estate product.
   * @return the total price of the real estate product.
   */
  public abstract int getPrice();

  /**
   * returns if the real estate has add-on: floor.
   * @return if the real estate has add-on: floor.
   */
  public boolean hasFloor() { return this.hasFloor; }

  /**
   * returns if the real estate has add-on: fridge.
   * @return if the real estate has add-on: fridge.
   */
  public boolean hasFridge() { return this.hasFridge; }

  /**
   * returns if the real estate has add-on: light.
   * @return if the real estate has add-on: light.
   */
  public boolean hasLight() { return this.hasLight; }

  /**
   * sets if the real estate has add-on: floor.
   * @param addOn the real estate has add-on: floor, or not.
   */
  public void setFloor(boolean addOn){ this.hasFloor = addOn; }

  /**
   * sets if the real estate has add-on: fridge.
   * @param addOn the real estate has add-on: fridge, or not.
   */
  public void setFridge(boolean addOn){ this.hasFridge = addOn; }

  /**
   * sets if the real estate has add-on: light.
   * @param addOn the real estate has add-on: light, or not.
   */
  public void setLight(boolean addOn){ this.hasLight = addOn; }

}
