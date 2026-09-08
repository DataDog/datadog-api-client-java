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

/** The JSON:API resource type for a unit cost. */
@JsonSerialize(using = UnitCostType.UnitCostTypeSerializer.class)
public class UnitCostType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("unit_cost"));

  public static final UnitCostType UNIT_COST = new UnitCostType("unit_cost");

  UnitCostType(String value) {
    super(value, allowedValues);
  }

  public static class UnitCostTypeSerializer extends StdSerializer<UnitCostType> {
    public UnitCostTypeSerializer(Class<UnitCostType> t) {
      super(t);
    }

    public UnitCostTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(UnitCostType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UnitCostType fromValue(String value) {
    return new UnitCostType(value);
  }
}
