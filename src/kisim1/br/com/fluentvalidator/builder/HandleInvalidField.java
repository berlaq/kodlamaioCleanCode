package kisim1.br.com.fluentvalidator.builder;

import kisim1.br.com.fluentvalidator.exception.ValidationException;

public interface HandleInvalidField<T, P, W extends When<T, P, W, N>, N extends Whenever<T, P, W, N>> extends RuleBuilder<T, P, W, N> {

  /**
   *
   * @return
   */
  Critical<T, P, W, N> critical();

  /**
   *
   * @param clazz
   * @return
   */
  Critical<T, P, W, N> critical(final Class<? extends ValidationException> clazz);

}
