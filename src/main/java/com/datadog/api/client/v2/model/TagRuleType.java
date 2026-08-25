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

/**
 * How the rule is enforced. <code>blocking</code> rejects telemetry that violates the rule. <code>
 * surfacing</code> only highlights non-compliant telemetry without blocking it.
 */
@JsonSerialize(using = TagRuleType.TagRuleTypeSerializer.class)
public class TagRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("blocking", "surfacing"));

  public static final TagRuleType BLOCKING = new TagRuleType("blocking");
  public static final TagRuleType SURFACING = new TagRuleType("surfacing");

  TagRuleType(String value) {
    super(value, allowedValues);
  }

  public static class TagRuleTypeSerializer extends StdSerializer<TagRuleType> {
    public TagRuleTypeSerializer(Class<TagRuleType> t) {
      super(t);
    }

    public TagRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TagRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagRuleType fromValue(String value) {
    return new TagRuleType(value);
  }
}
