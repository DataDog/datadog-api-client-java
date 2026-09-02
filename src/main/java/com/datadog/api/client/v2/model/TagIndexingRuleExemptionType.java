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

/** The tag indexing rule exemption resource type. */
@JsonSerialize(using = TagIndexingRuleExemptionType.TagIndexingRuleExemptionTypeSerializer.class)
public class TagIndexingRuleExemptionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("tag_indexing_rule_exemptions"));

  public static final TagIndexingRuleExemptionType TAG_INDEXING_RULE_EXEMPTIONS =
      new TagIndexingRuleExemptionType("tag_indexing_rule_exemptions");

  TagIndexingRuleExemptionType(String value) {
    super(value, allowedValues);
  }

  public static class TagIndexingRuleExemptionTypeSerializer
      extends StdSerializer<TagIndexingRuleExemptionType> {
    public TagIndexingRuleExemptionTypeSerializer(Class<TagIndexingRuleExemptionType> t) {
      super(t);
    }

    public TagIndexingRuleExemptionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagIndexingRuleExemptionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagIndexingRuleExemptionType fromValue(String value) {
    return new TagIndexingRuleExemptionType(value);
  }
}
