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

/** The type of the changed resource. */
@JsonSerialize(
    using =
        ChangeEventAttributesChangedResourceType.ChangeEventAttributesChangedResourceTypeSerializer
            .class)
public class ChangeEventAttributesChangedResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("feature_flag", "configuration"));

  public static final ChangeEventAttributesChangedResourceType FEATURE_FLAG =
      new ChangeEventAttributesChangedResourceType("feature_flag");
  public static final ChangeEventAttributesChangedResourceType CONFIGURATION =
      new ChangeEventAttributesChangedResourceType("configuration");

  ChangeEventAttributesChangedResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeEventAttributesChangedResourceTypeSerializer
      extends StdSerializer<ChangeEventAttributesChangedResourceType> {
    public ChangeEventAttributesChangedResourceTypeSerializer(
        Class<ChangeEventAttributesChangedResourceType> t) {
      super(t);
    }

    public ChangeEventAttributesChangedResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeEventAttributesChangedResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeEventAttributesChangedResourceType fromValue(String value) {
    return new ChangeEventAttributesChangedResourceType(value);
  }
}
