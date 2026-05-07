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

/** Preferred tags resource type. */
@JsonSerialize(using = CostAIPreferredTagsType.CostAIPreferredTagsTypeSerializer.class)
public class CostAIPreferredTagsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("preferred_tags"));

  public static final CostAIPreferredTagsType PREFERRED_TAGS =
      new CostAIPreferredTagsType("preferred_tags");

  CostAIPreferredTagsType(String value) {
    super(value, allowedValues);
  }

  public static class CostAIPreferredTagsTypeSerializer
      extends StdSerializer<CostAIPreferredTagsType> {
    public CostAIPreferredTagsTypeSerializer(Class<CostAIPreferredTagsType> t) {
      super(t);
    }

    public CostAIPreferredTagsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostAIPreferredTagsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostAIPreferredTagsType fromValue(String value) {
    return new CostAIPreferredTagsType(value);
  }
}
