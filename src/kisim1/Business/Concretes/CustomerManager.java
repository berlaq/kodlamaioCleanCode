package kisim1.Business.Concretes;

import kisim1.Business.Abstracts.PersonService;
import kisim1.Business.Utilities.Utility;
import kisim1.Business.ValidationRules.FluentValidation.CustomerValidator;
import kisim1.DataAccess.Abstracts.CustomerDao;
import kisim1.Entity.Concretes.Customer;
import kisim1.Entity.Concretes.Person;

public class CustomerManager {

    CustomerDao customerDal;
    PersonService personService;

    public CustomerManager(CustomerDao customerDal, PersonService personService) {
        this.customerDal = customerDal;
        this.personService = personService;
    }

    public void add(Customer customer) {

       Utility.validate(new CustomerValidator(),customer);
        checkPersonReal(customer);
        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    public void addByOtherRule(Customer customer){
        validateFirstNameIfEmty(customer);
        validateLastNameIfEmpty(customer);

        validateFirstNameLength(customer);

        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    /**
     * Verilen müşteri için doğrulama yapılır
     * @param customer kişi bilgisi
     */
    public void checkCustomerExists(Customer customer){

        if(customerDal.customerExist(customer)){
            throw new RuntimeException("Müşteri zaten kayıtlı");
        }
    }

    private void checkPersonReal(Person person){
        if(!personService.checkPerson(person)){
            throw new RuntimeException("Kişi hatalı");
        }
    }

    private void validateFirstNameIfEmty(Customer customer){
        if(customer.getFirstName().isEmpty()){
            throw new RuntimeException("validasyon hatası");
        }
    }
    public void validateLastNameIfEmpty(Customer customer){
        if(customer.getLastName().isEmpty()){
            throw new RuntimeException("validasyon hatası");
        }
    }
    public void validateIdentityNumberIfEmpty(Customer customer){
        if(customer.getIdentityNumber().isEmpty()){
            throw new RuntimeException("validasyon hatası");
        }
    }
    public void validateFirstNameLength(Customer customer){
        if(customer.getFirstName().length() <=2){
            throw new RuntimeException("validasyon hatası");
        }
    }

}
