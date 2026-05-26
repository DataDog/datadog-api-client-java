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

/** AI custom rule resource type. */
@JsonSerialize(using = AiCustomRuleDataType.AiCustomRuleDataTypeSerializer.class)
public class AiCustomRuleDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ai_rule"));

  public static final AiCustomRuleDataType AI_RULE = new AiCustomRuleDataType("ai_rule");

  AiCustomRuleDataType(String value) {
    super(value, allowedValues);
  }

  public static class AiCustomRuleDataTypeSerializer extends StdSerializer<AiCustomRuleDataType> {
    public AiCustomRuleDataTypeSerializer(Class<AiCustomRuleDataType> t) {
      super(t);
    }

    public AiCustomRuleDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiCustomRuleDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiCustomRuleDataType fromValue(String value) {
    return new AiCustomRuleDataType(value);
  }
}
