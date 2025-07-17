/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The type of the author. */
@JsonSerialize(
    using = ChangeEventAttributesAuthorType.ChangeEventAttributesAuthorTypeSerializer.class)
public class ChangeEventAttributesAuthorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user", "system", "api", "automation"));

  public static final ChangeEventAttributesAuthorType USER =
      new ChangeEventAttributesAuthorType("user");
  public static final ChangeEventAttributesAuthorType SYSTEM =
      new ChangeEventAttributesAuthorType("system");
  public static final ChangeEventAttributesAuthorType API =
      new ChangeEventAttributesAuthorType("api");
  public static final ChangeEventAttributesAuthorType AUTOMATION =
      new ChangeEventAttributesAuthorType("automation");

  ChangeEventAttributesAuthorType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeEventAttributesAuthorTypeSerializer
      extends StdSerializer<ChangeEventAttributesAuthorType> {
    public ChangeEventAttributesAuthorTypeSerializer(Class<ChangeEventAttributesAuthorType> t) {
      super(t);
    }

    public ChangeEventAttributesAuthorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeEventAttributesAuthorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeEventAttributesAuthorType fromValue(String value) {
    return new ChangeEventAttributesAuthorType(value);
  }
}
