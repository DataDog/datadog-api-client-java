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

/** Active tag key resource type. */
@JsonSerialize(using = CostTagPipelineActiveKeyType.CostTagPipelineActiveKeyTypeSerializer.class)
public class CostTagPipelineActiveKeyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active_tag_key"));

  public static final CostTagPipelineActiveKeyType ACTIVE_TAG_KEY =
      new CostTagPipelineActiveKeyType("active_tag_key");

  CostTagPipelineActiveKeyType(String value) {
    super(value, allowedValues);
  }

  public static class CostTagPipelineActiveKeyTypeSerializer
      extends StdSerializer<CostTagPipelineActiveKeyType> {
    public CostTagPipelineActiveKeyTypeSerializer(Class<CostTagPipelineActiveKeyType> t) {
      super(t);
    }

    public CostTagPipelineActiveKeyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostTagPipelineActiveKeyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostTagPipelineActiveKeyType fromValue(String value) {
    return new CostTagPipelineActiveKeyType(value);
  }
}
