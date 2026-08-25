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

/** JSON:API resource type for a tag rule. */
@JsonSerialize(using = TagRuleResourceType.TagRuleResourceTypeSerializer.class)
public class TagRuleResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tag_rule"));

  public static final TagRuleResourceType TAG_RULE = new TagRuleResourceType("tag_rule");

  TagRuleResourceType(String value) {
    super(value, allowedValues);
  }

  public static class TagRuleResourceTypeSerializer extends StdSerializer<TagRuleResourceType> {
    public TagRuleResourceTypeSerializer(Class<TagRuleResourceType> t) {
      super(t);
    }

    public TagRuleResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagRuleResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagRuleResourceType fromValue(String value) {
    return new TagRuleResourceType(value);
  }
}
