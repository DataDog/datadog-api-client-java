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

/** Included related resources optionally requested. */
@JsonSerialize(using = ListTeamsInclude.ListTeamsIncludeSerializer.class)
public class ListTeamsInclude {

  public static final ListTeamsInclude TEAM_LINKS = new ListTeamsInclude("team_links");
  public static final ListTeamsInclude USER_TEAM_PERMISSIONS =
      new ListTeamsInclude("user_team_permissions");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("team_links", "user_team_permissions"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ListTeamsInclude(String value) {
    this.value = value;
  }

  public static class ListTeamsIncludeSerializer extends StdSerializer<ListTeamsInclude> {
    public ListTeamsIncludeSerializer(Class<ListTeamsInclude> t) {
      super(t);
    }

    public ListTeamsIncludeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ListTeamsInclude value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ListTeamsInclude object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ListTeamsInclude) o).value);
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
  public static ListTeamsInclude fromValue(String value) {
    return new ListTeamsInclude(value);
  }
}
