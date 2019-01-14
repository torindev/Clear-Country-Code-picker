package torin_dev.com.clearcountrycodepicker;

public class Country {
  private final String iso;
  private final String phoneCode;
  private final String name;

  private int type;

  public Country(String iso, String phoneCode, String name) {
    this.iso = iso;
    this.phoneCode = phoneCode;
    this.name = name;
  }

  public String getIso() {
    return iso;
  }

  public String getPhoneCode() {
    return phoneCode;
  }

  public String getName() {
    return name;
  }

  /**
   * If country have query word in name or name code or phone code, this will return true.
   */
  public boolean isEligibleForQuery(String query) {
    query = query.toLowerCase();
    return getName().toLowerCase().contains(query)
        || getIso().toLowerCase().contains(query)
        || getPhoneCode().toLowerCase().contains(query);
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
}
