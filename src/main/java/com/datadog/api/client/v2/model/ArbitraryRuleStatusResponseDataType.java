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

/** Arbitrary rule status resource type. */
@JsonSerialize(
    using = ArbitraryRuleStatusResponseDataType.ArbitraryRuleStatusResponseDataTypeSerializer.class)
public class ArbitraryRuleStatusResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("arbitrary_rule_status"));

  public static final ArbitraryRuleStatusResponseDataType ARBITRARY_RULE_STATUS =
      new ArbitraryRuleStatusResponseDataType("arbitrary_rule_status");

  ArbitraryRuleStatusResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class ArbitraryRuleStatusResponseDataTypeSerializer
      extends StdSerializer<ArbitraryRuleStatusResponseDataType> {
    public ArbitraryRuleStatusResponseDataTypeSerializer(
        Class<ArbitraryRuleStatusResponseDataType> t) {
      super(t);
    }

    public ArbitraryRuleStatusResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ArbitraryRuleStatusResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArbitraryRuleStatusResponseDataType fromValue(String value) {
    return new ArbitraryRuleStatusResponseDataType(value);
  }
}
