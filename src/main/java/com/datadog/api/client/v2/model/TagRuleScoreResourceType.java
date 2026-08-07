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

/** JSON:API resource type for a tag rule compliance score. */
@JsonSerialize(using = TagRuleScoreResourceType.TagRuleScoreResourceTypeSerializer.class)
public class TagRuleScoreResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("tag_policy_score"));

  public static final TagRuleScoreResourceType TAG_POLICY_SCORE =
      new TagRuleScoreResourceType("tag_policy_score");

  TagRuleScoreResourceType(String value) {
    super(value, allowedValues);
  }

  public static class TagRuleScoreResourceTypeSerializer
      extends StdSerializer<TagRuleScoreResourceType> {
    public TagRuleScoreResourceTypeSerializer(Class<TagRuleScoreResourceType> t) {
      super(t);
    }

    public TagRuleScoreResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagRuleScoreResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagRuleScoreResourceType fromValue(String value) {
    return new TagRuleScoreResourceType(value);
  }
}
