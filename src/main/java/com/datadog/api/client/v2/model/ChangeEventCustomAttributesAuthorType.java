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

/** Author's type. */
@JsonSerialize(
    using =
        ChangeEventCustomAttributesAuthorType.ChangeEventCustomAttributesAuthorTypeSerializer.class)
public class ChangeEventCustomAttributesAuthorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user", "system", "api", "automation"));

  public static final ChangeEventCustomAttributesAuthorType USER =
      new ChangeEventCustomAttributesAuthorType("user");
  public static final ChangeEventCustomAttributesAuthorType SYSTEM =
      new ChangeEventCustomAttributesAuthorType("system");
  public static final ChangeEventCustomAttributesAuthorType API =
      new ChangeEventCustomAttributesAuthorType("api");
  public static final ChangeEventCustomAttributesAuthorType AUTOMATION =
      new ChangeEventCustomAttributesAuthorType("automation");

  ChangeEventCustomAttributesAuthorType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeEventCustomAttributesAuthorTypeSerializer
      extends StdSerializer<ChangeEventCustomAttributesAuthorType> {
    public ChangeEventCustomAttributesAuthorTypeSerializer(
        Class<ChangeEventCustomAttributesAuthorType> t) {
      super(t);
    }

    public ChangeEventCustomAttributesAuthorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeEventCustomAttributesAuthorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeEventCustomAttributesAuthorType fromValue(String value) {
    return new ChangeEventCustomAttributesAuthorType(value);
  }
}
