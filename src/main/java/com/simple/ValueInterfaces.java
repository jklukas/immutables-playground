package com.simple;

import org.immutables.value.Value;

public class ValueInterfaces {

  /**
   * A user.
   */
  @Value.Immutable
  public interface User {
    public int first();
    public String second();
  }

}
