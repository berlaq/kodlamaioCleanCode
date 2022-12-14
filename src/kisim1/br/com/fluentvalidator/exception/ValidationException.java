package kisim1.br.com.fluentvalidator.exception;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kisim1.br.com.fluentvalidator.context.ValidationContext;
import kisim1.br.com.fluentvalidator.context.ValidationResult;

public abstract class ValidationException extends RuntimeException {

  private static final long serialVersionUID = 2274879814700248645L;

  private final transient ValidationResult validationResult;

  protected ValidationException(final ValidationResult validationResult) {
    super(validationResult.toString());
    this.validationResult = validationResult;
  }

  /**
   *
   * @return
   */
  public ValidationResult getValidationResult() {
    return validationResult;
  }

  /**
   *
   * @param exceptionClass
   * @return
   */
  public static <T extends ValidationException> RuntimeException create(final Class<T> exceptionClass) {
    return create(exceptionClass, ValidationContext.get().getValidationResult());
  }

  /**
   *
   * @param exceptionClass
   * @param validationResult
   * @return
   */
  public static <T extends ValidationException> RuntimeException create(final Class<T> exceptionClass, final ValidationResult validationResult) {
    try {
      final Constructor<? extends ValidationException> ctor =
          exceptionClass.getConstructor(ValidationResult.class);
      return ctor.newInstance(validationResult);
    } catch (final NoSuchMethodException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
      return new RuntimeException(
          "Constructor in class not found (ValidationResult validationResult)", e);
    }
  }

}
