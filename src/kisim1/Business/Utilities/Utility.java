package kisim1.Business.Utilities;

import kisim1.br.com.fluentvalidator.Validator;
import kisim1.br.com.fluentvalidator.context.ValidationResult;
import kisim1.br.com.fluentvalidator.exception.ValidationException;

public class Utility {
    public static void validate(Validator validator, Object entity) {

        var result = validator.validate(entity);

        if (!result.isValid()) {
            throw new ValidationException(result) {
                @Override
                public ValidationResult getValidationResult() {
                    return super.getValidationResult();
                }
            };
        }
    }



}