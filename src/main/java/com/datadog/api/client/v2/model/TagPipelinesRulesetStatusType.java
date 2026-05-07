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

/** Tag pipeline ruleset status resource type. */
@JsonSerialize(using = TagPipelinesRulesetStatusType.TagPipelinesRulesetStatusTypeSerializer.class)
public class TagPipelinesRulesetStatusType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ruleset_status"));

  public static final TagPipelinesRulesetStatusType RULESET_STATUS =
      new TagPipelinesRulesetStatusType("ruleset_status");

  TagPipelinesRulesetStatusType(String value) {
    super(value, allowedValues);
  }

  public static class TagPipelinesRulesetStatusTypeSerializer
      extends StdSerializer<TagPipelinesRulesetStatusType> {
    public TagPipelinesRulesetStatusTypeSerializer(Class<TagPipelinesRulesetStatusType> t) {
      super(t);
    }

    public TagPipelinesRulesetStatusTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagPipelinesRulesetStatusType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagPipelinesRulesetStatusType fromValue(String value) {
    return new TagPipelinesRulesetStatusType(value);
  }
}
