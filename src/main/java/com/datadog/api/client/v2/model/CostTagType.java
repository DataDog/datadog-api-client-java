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

/** Type of the Cloud Cost Management tag resource. */
@JsonSerialize(using = CostTagType.CostTagTypeSerializer.class)
public class CostTagType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("cost_tag"));

  public static final CostTagType COST_TAG = new CostTagType("cost_tag");

  CostTagType(String value) {
    super(value, allowedValues);
  }

  public static class CostTagTypeSerializer extends StdSerializer<CostTagType> {
    public CostTagTypeSerializer(Class<CostTagType> t) {
      super(t);
    }

    public CostTagTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CostTagType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagType fromValue(String value) {
    return new CostTagType(value);
  }
}
