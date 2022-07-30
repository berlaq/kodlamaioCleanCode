package kisim1.Business.ServiceAdapters;

import kisim1.Business.Abstracts.PersonService;
import kisim1.Entity.Concretes.Person;

public class KpsServiceAdapter implements PersonService {

        @Override
        public boolean checkPerson(Person person) {
            KpsService kpsService = new KpsService();
            return kpsService.checkPerson(person.getIdentityNumber(), person.getFirstName(), person.getLastName(), person.getYear());
        }
    }
