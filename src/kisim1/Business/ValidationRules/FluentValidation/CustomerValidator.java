package kisim1.Business.ValidationRules.FluentValidation;

import kisim1.Entity.Concretes.Customer;
import kisim1.br.com.fluentvalidator.AbstractValidator;

import static kisim1.br.com.fluentvalidator.predicate.LogicalPredicate.not;
import static kisim1.br.com.fluentvalidator.predicate.ObjectPredicate.nullValue;

public class CustomerValidator extends AbstractValidator<Customer> {

    public CustomerValidator() {


    }

    @Override
    public void rules() {
        setPropertyOnContext("customer");

        ruleFor(customer -> customer.getFirstName())
                .must(not(nullValue()))
                .withMessage("İsim boş olamaz!")
                .withFieldName("first name");

        ruleFor(Customer::getLastName).must(not(nullValue()))
                .withMessage("soy isim boş olamaz")
                .withFieldName("last name");
        ruleFor(Customer::getLastName)
                .must(not(nullValue()))
                .withMessage("İsim boş olamaz!")
                .withFieldName("first name");
        //ruleFor(customer -> customer.getIdentityNumber()).must()
    }
}

