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

/** Type of the AI-generated Cloud Cost Management tag description resource. */
@JsonSerialize(
    using = GeneratedCostTagDescriptionType.GeneratedCostTagDescriptionTypeSerializer.class)
public class GeneratedCostTagDescriptionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cost_generated_tag_description"));

  public static final GeneratedCostTagDescriptionType COST_GENERATED_TAG_DESCRIPTION =
      new GeneratedCostTagDescriptionType("cost_generated_tag_description");

  GeneratedCostTagDescriptionType(String value) {
    super(value, allowedValues);
  }

  public static class GeneratedCostTagDescriptionTypeSerializer
      extends StdSerializer<GeneratedCostTagDescriptionType> {
    public GeneratedCostTagDescriptionTypeSerializer(Class<GeneratedCostTagDescriptionType> t) {
      super(t);
    }

    public GeneratedCostTagDescriptionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeneratedCostTagDescriptionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeneratedCostTagDescriptionType fromValue(String value) {
    return new GeneratedCostTagDescriptionType(value);
  }
}
