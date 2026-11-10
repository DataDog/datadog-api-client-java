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

/** The kind of transform. */
@JsonSerialize(
    using = ArbitraryRuleTagValueTransformType.ArbitraryRuleTagValueTransformTypeSerializer.class)
public class ArbitraryRuleTagValueTransformType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("string_replace", "regex_extract", "regex_replace", "lookup_map"));

  public static final ArbitraryRuleTagValueTransformType STRING_REPLACE =
      new ArbitraryRuleTagValueTransformType("string_replace");
  public static final ArbitraryRuleTagValueTransformType REGEX_EXTRACT =
      new ArbitraryRuleTagValueTransformType("regex_extract");
  public static final ArbitraryRuleTagValueTransformType REGEX_REPLACE =
      new ArbitraryRuleTagValueTransformType("regex_replace");
  public static final ArbitraryRuleTagValueTransformType LOOKUP_MAP =
      new ArbitraryRuleTagValueTransformType("lookup_map");

  ArbitraryRuleTagValueTransformType(String value) {
    super(value, allowedValues);
  }

  public static class ArbitraryRuleTagValueTransformTypeSerializer
      extends StdSerializer<ArbitraryRuleTagValueTransformType> {
    public ArbitraryRuleTagValueTransformTypeSerializer(
        Class<ArbitraryRuleTagValueTransformType> t) {
      super(t);
    }

    public ArbitraryRuleTagValueTransformTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ArbitraryRuleTagValueTransformType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArbitraryRuleTagValueTransformType fromValue(String value) {
    return new ArbitraryRuleTagValueTransformType(value);
  }
}
