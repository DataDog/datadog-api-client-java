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

/** Type of the Custom Costs file resource. */
@JsonSerialize(using = CustomCostsFileUpdateType.CustomCostsFileUpdateTypeSerializer.class)
public class CustomCostsFileUpdateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_metadata"));

  public static final CustomCostsFileUpdateType COST_METADATA =
      new CustomCostsFileUpdateType("cost_metadata");

  CustomCostsFileUpdateType(String value) {
    super(value, allowedValues);
  }

  public static class CustomCostsFileUpdateTypeSerializer
      extends StdSerializer<CustomCostsFileUpdateType> {
    public CustomCostsFileUpdateTypeSerializer(Class<CustomCostsFileUpdateType> t) {
      super(t);
    }

    public CustomCostsFileUpdateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomCostsFileUpdateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomCostsFileUpdateType fromValue(String value) {
    return new CustomCostsFileUpdateType(value);
  }
}
