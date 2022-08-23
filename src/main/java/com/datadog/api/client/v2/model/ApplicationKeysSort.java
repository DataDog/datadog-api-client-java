/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Sorting options */
@JsonSerialize(using = ApplicationKeysSort.ApplicationKeysSortSerializer.class)
public class ApplicationKeysSort {

  public static final ApplicationKeysSort CREATED_AT_ASCENDING =
      new ApplicationKeysSort("created_at");
  public static final ApplicationKeysSort CREATED_AT_DESCENDING =
      new ApplicationKeysSort("-created_at");
  public static final ApplicationKeysSort LAST4_ASCENDING = new ApplicationKeysSort("last4");
  public static final ApplicationKeysSort LAST4_DESCENDING = new ApplicationKeysSort("-last4");
  public static final ApplicationKeysSort NAME_ASCENDING = new ApplicationKeysSort("name");
  public static final ApplicationKeysSort NAME_DESCENDING = new ApplicationKeysSort("-name");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("created_at", "-created_at", "last4", "-last4", "name", "-name"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ApplicationKeysSort(String value) {
    this.value = value;
  }

  public static class ApplicationKeysSortSerializer extends StdSerializer<ApplicationKeysSort> {
    public ApplicationKeysSortSerializer(Class<ApplicationKeysSort> t) {
      super(t);
    }

    public ApplicationKeysSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationKeysSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this ApplicationKeysSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ApplicationKeysSort) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationKeysSort fromValue(String value) {
    return new ApplicationKeysSort(value);
  }
}
