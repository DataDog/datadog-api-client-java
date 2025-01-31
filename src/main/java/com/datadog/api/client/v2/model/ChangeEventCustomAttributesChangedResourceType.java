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

/** Resource's type. */
@JsonSerialize(
    using =
        ChangeEventCustomAttributesChangedResourceType
            .ChangeEventCustomAttributesChangedResourceTypeSerializer.class)
public class ChangeEventCustomAttributesChangedResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("feature_flag", "configuration"));

  public static final ChangeEventCustomAttributesChangedResourceType FEATURE_FLAG =
      new ChangeEventCustomAttributesChangedResourceType("feature_flag");
  public static final ChangeEventCustomAttributesChangedResourceType CONFIGURATION =
      new ChangeEventCustomAttributesChangedResourceType("configuration");

  ChangeEventCustomAttributesChangedResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeEventCustomAttributesChangedResourceTypeSerializer
      extends StdSerializer<ChangeEventCustomAttributesChangedResourceType> {
    public ChangeEventCustomAttributesChangedResourceTypeSerializer(
        Class<ChangeEventCustomAttributesChangedResourceType> t) {
      super(t);
    }

    public ChangeEventCustomAttributesChangedResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeEventCustomAttributesChangedResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeEventCustomAttributesChangedResourceType fromValue(String value) {
    return new ChangeEventCustomAttributesChangedResourceType(value);
  }
}
