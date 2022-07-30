package kisim1.br.com.fluentvalidator.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import kisim1.br.com.fluentvalidator.annotation.CleanValidationContextException;
import kisim1.br.com.fluentvalidator.context.ValidationContext;

@Aspect
public class ValidationExceptionAdvice {

  @AfterThrowing("execution(* *(..)) && @annotation(cleanValidationContextException)")
  public void afterThrowing(final CleanValidationContextException cleanValidationContextException) {
    ValidationContext.remove();
  }

}
