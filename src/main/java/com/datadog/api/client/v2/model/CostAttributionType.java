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

/** Type of cost attribution data. */
@JsonSerialize(using = CostAttributionType.CostAttributionTypeSerializer.class)
public class CostAttributionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_by_tag"));

  public static final CostAttributionType COST_BY_TAG = new CostAttributionType("cost_by_tag");

  CostAttributionType(String value) {
    super(value, allowedValues);
  }

  public static class CostAttributionTypeSerializer extends StdSerializer<CostAttributionType> {
    public CostAttributionTypeSerializer(Class<CostAttributionType> t) {
      super(t);
    }

    public CostAttributionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostAttributionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostAttributionType fromValue(String value) {
    return new CostAttributionType(value);
  }
}
