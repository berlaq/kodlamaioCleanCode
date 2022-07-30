package kisim1.br.com.fluentvalidator.rule;

import java.util.function.Function;

import kisim1.br.com.fluentvalidator.builder.AttemptedValue;
import kisim1.br.com.fluentvalidator.builder.Code;
import kisim1.br.com.fluentvalidator.builder.Critical;
import kisim1.br.com.fluentvalidator.builder.FieldName;
import kisim1.br.com.fluentvalidator.builder.HandleInvalidField;
import kisim1.br.com.fluentvalidator.builder.Message;
import kisim1.br.com.fluentvalidator.builder.Must;
import kisim1.br.com.fluentvalidator.builder.When;
import kisim1.br.com.fluentvalidator.builder.Whenever;
import kisim1.br.com.fluentvalidator.builder.WithValidator;

abstract class AbstractRuleBuilder<T, P, W extends When<T, P, W, N>, N extends Whenever<T, P, W, N>>
    implements Must<T, P, W, N>, Message<T, P, W, N>, FieldName<T, P, W, N>, Code<T, P, W, N>, Critical<T, P, W, N>, WithValidator<T, P, W, N>, HandleInvalidField<T, P, W, N>, AttemptedValue<T, P, W, N>, Rule<T> {

  protected final Function<T, String> fieldName;

  protected final Function<T, P> function;

  protected AbstractRuleBuilder(final Function<T, String> fieldName, final Function<T, P> function) {
    this.fieldName = fieldName;
    this.function = function;
  }

  protected AbstractRuleBuilder(final String fieldName, final Function<T, P> function) {
    this(obj -> fieldName, function);
  }

  protected AbstractRuleBuilder(final Function<T, P> function) {
    this(obj -> null, function);
  }

}
