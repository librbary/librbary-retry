package io.github.librbary.core;

import io.github.librbary.annotation.Retry;

/**
 * Thrown when there is a failure or violation of input parameters of
 * {@link Retry} annotation.
 */
public class RetryException extends RuntimeException {

  public RetryException(String message) {
    super(message);
  }

  public RetryException(String message, Throwable cause) {
    super(message, cause);
  }

  public RetryException(Throwable cause) {
    super(cause);
  }
}
