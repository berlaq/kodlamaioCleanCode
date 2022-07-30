package kisim1.Entity.Concretes;

public class Customer extends Person {

    private int cityId;

    public Customer(int id, String firstName, String lastName, String identityNumber, int year, int cityId) {
        super(id, firstName, lastName, identityNumber, year);
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


}