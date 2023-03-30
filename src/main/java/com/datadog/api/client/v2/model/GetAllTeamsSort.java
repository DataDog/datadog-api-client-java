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

/** Specifies the order of the returned teams */
@JsonSerialize(using = GetAllTeamsSort.GetAllTeamsSortSerializer.class)
public class GetAllTeamsSort {

  public static final GetAllTeamsSort NAME = new GetAllTeamsSort("name");
  public static final GetAllTeamsSort _NAME = new GetAllTeamsSort("-name");
  public static final GetAllTeamsSort USER_COUNT = new GetAllTeamsSort("user_count");
  public static final GetAllTeamsSort _USER_COUNT = new GetAllTeamsSort("-user_count");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("name", "-name", "user_count", "-user_count"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  GetAllTeamsSort(String value) {
    this.value = value;
  }

  public static class GetAllTeamsSortSerializer extends StdSerializer<GetAllTeamsSort> {
    public GetAllTeamsSortSerializer(Class<GetAllTeamsSort> t) {
      super(t);
    }

    public GetAllTeamsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(GetAllTeamsSort value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this GetAllTeamsSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((GetAllTeamsSort) o).value);
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
  public static GetAllTeamsSort fromValue(String value) {
    return new GetAllTeamsSort(value);
  }
}
