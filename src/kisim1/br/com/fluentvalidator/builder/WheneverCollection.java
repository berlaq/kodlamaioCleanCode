package kisim1.br.com.fluentvalidator.builder;

import java.util.Collection;

import kisim1.br.com.fluentvalidator.Validator;

public interface WheneverCollection<T, P> extends Whenever<T, Collection<P>, WhenCollection<T, P>, WheneverCollection<T, P>> {

  /**
   *
   * @param validator
   * @return
   */
  WithValidator<T, Collection<P>, WhenCollection<T, P>, WheneverCollection<T, P>> withValidator(final Validator<P> validator);

}
