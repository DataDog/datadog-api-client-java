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
        ChangeEventCustomAttributesImpactedResourcesItemsType
            .ChangeEventCustomAttributesImpactedResourcesItemsTypeSerializer.class)
public class ChangeEventCustomAttributesImpactedResourcesItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("service"));

  public static final ChangeEventCustomAttributesImpactedResourcesItemsType SERVICE =
      new ChangeEventCustomAttributesImpactedResourcesItemsType("service");

  ChangeEventCustomAttributesImpactedResourcesItemsType(String value) {
    super(value, allowedValues);
  }

  public static class ChangeEventCustomAttributesImpactedResourcesItemsTypeSerializer
      extends StdSerializer<ChangeEventCustomAttributesImpactedResourcesItemsType> {
    public ChangeEventCustomAttributesImpactedResourcesItemsTypeSerializer(
        Class<ChangeEventCustomAttributesImpactedResourcesItemsType> t) {
      super(t);
    }

    public ChangeEventCustomAttributesImpactedResourcesItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeEventCustomAttributesImpactedResourcesItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeEventCustomAttributesImpactedResourcesItemsType fromValue(String value) {
    return new ChangeEventCustomAttributesImpactedResourcesItemsType(value);
  }
}
