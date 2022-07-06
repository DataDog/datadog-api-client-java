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
@JsonSerialize(using = APIKeysSort.APIKeysSortSerializer.class)
public class APIKeysSort {

  public static final APIKeysSort CREATED_AT_ASCENDING = new APIKeysSort("created_at");
  public static final APIKeysSort CREATED_AT_DESCENDING = new APIKeysSort("-created_at");
  public static final APIKeysSort LAST4_ASCENDING = new APIKeysSort("last4");
  public static final APIKeysSort LAST4_DESCENDING = new APIKeysSort("-last4");
  public static final APIKeysSort MODIFIED_AT_ASCENDING = new APIKeysSort("modified_at");
  public static final APIKeysSort MODIFIED_AT_DESCENDING = new APIKeysSort("-modified_at");
  public static final APIKeysSort NAME_ASCENDING = new APIKeysSort("name");
  public static final APIKeysSort NAME_DESCENDING = new APIKeysSort("-name");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "created_at",
              "-created_at",
              "last4",
              "-last4",
              "modified_at",
              "-modified_at",
              "name",
              "-name"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  APIKeysSort(String value) {
    this.value = value;
  }

  public static class APIKeysSortSerializer extends StdSerializer<APIKeysSort> {
    public APIKeysSortSerializer(Class<APIKeysSort> t) {
      super(t);
    }

    public APIKeysSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(APIKeysSort value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this APIKeysSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((APIKeysSort) o).value);
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
  public static APIKeysSort fromValue(String value) {
    return new APIKeysSort(value);
  }
}
