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
 * The rule type allowed when creating a tag rule. Only <code>surfacing</code> is accepted at
 * creation time.
 */
@JsonSerialize(using = TagRuleCreateType.TagRuleCreateTypeSerializer.class)
public class TagRuleCreateType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("surfacing"));

  public static final TagRuleCreateType SURFACING = new TagRuleCreateType("surfacing");

  TagRuleCreateType(String value) {
    super(value, allowedValues);
  }

  public static class TagRuleCreateTypeSerializer extends StdSerializer<TagRuleCreateType> {
    public TagRuleCreateTypeSerializer(Class<TagRuleCreateType> t) {
      super(t);
    }

    public TagRuleCreateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TagRuleCreateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagRuleCreateType fromValue(String value) {
    return new TagRuleCreateType(value);
  }
}
