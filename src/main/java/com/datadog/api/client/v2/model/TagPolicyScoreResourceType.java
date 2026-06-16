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

/** JSON:API resource type for a tag policy compliance score. */
@JsonSerialize(using = TagPolicyScoreResourceType.TagPolicyScoreResourceTypeSerializer.class)
public class TagPolicyScoreResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("tag_policy_score"));

  public static final TagPolicyScoreResourceType TAG_POLICY_SCORE =
      new TagPolicyScoreResourceType("tag_policy_score");

  TagPolicyScoreResourceType(String value) {
    super(value, allowedValues);
  }

  public static class TagPolicyScoreResourceTypeSerializer
      extends StdSerializer<TagPolicyScoreResourceType> {
    public TagPolicyScoreResourceTypeSerializer(Class<TagPolicyScoreResourceType> t) {
      super(t);
    }

    public TagPolicyScoreResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagPolicyScoreResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagPolicyScoreResourceType fromValue(String value) {
    return new TagPolicyScoreResourceType(value);
  }
}
