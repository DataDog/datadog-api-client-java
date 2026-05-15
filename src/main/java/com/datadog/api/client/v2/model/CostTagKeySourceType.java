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

/** Type of the Cloud Cost Management tag source resource. */
@JsonSerialize(using = CostTagKeySourceType.CostTagKeySourceTypeSerializer.class)
public class CostTagKeySourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_tag_key_source"));

  public static final CostTagKeySourceType COST_TAG_KEY_SOURCE =
      new CostTagKeySourceType("cost_tag_key_source");

  CostTagKeySourceType(String value) {
    super(value, allowedValues);
  }

  public static class CostTagKeySourceTypeSerializer extends StdSerializer<CostTagKeySourceType> {
    public CostTagKeySourceTypeSerializer(Class<CostTagKeySourceType> t) {
      super(t);
    }

    public CostTagKeySourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagKeySourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagKeySourceType fromValue(String value) {
    return new CostTagKeySourceType(value);
  }
}
