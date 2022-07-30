package kisim1.br.com.fluentvalidator.builder;

import kisim1.br.com.fluentvalidator.Validator;

public interface WheneverProperty<T, P> extends Whenever<T, P, WhenProperty<T, P>, WheneverProperty<T, P>> {

  /**
   *
   * @param validator
   * @return
   */
  WithValidator<T, P, WhenProperty<T, P>, WheneverProperty<T, P>> withValidator(final Validator<P> validator);

}
