package kisim1.br.com.fluentvalidator.transform;

import kisim1.br.com.fluentvalidator.context.ValidationResult;

public interface ValidationResultTransform<E> {

  /**
   *
   * @param validationResult
   * @return
   */
  E transform(final ValidationResult validationResult);

}
