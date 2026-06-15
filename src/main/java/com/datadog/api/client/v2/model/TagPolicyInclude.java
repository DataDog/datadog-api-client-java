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
 * A related resource to include alongside a tag policy in the response. Currently the only
 * supported value is <code>score</code>.
 */
@JsonSerialize(using = TagPolicyInclude.TagPolicyIncludeSerializer.class)
public class TagPolicyInclude extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("score"));

  public static final TagPolicyInclude SCORE = new TagPolicyInclude("score");

  TagPolicyInclude(String value) {
    super(value, allowedValues);
  }

  public static class TagPolicyIncludeSerializer extends StdSerializer<TagPolicyInclude> {
    public TagPolicyIncludeSerializer(Class<TagPolicyInclude> t) {
      super(t);
    }

    public TagPolicyIncludeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TagPolicyInclude value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagPolicyInclude fromValue(String value) {
    return new TagPolicyInclude(value);
  }
}
