package com.datadog.api.client;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;
import java.util.Set;

public abstract class ModelEnum<T> {

  protected Set localAllowedValues;

  protected T value;

  public ModelEnum(T value, Set allowedValues) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public boolean isValid() {
    return this.localAllowedValues.contains(this.value);
  }

  @JsonValue
  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ModelEnum<T>) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
