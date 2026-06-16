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
 * The policy type allowed when creating a tag policy. Only <code>surfacing</code> is accepted at
 * creation time.
 */
@JsonSerialize(using = TagPolicyCreateType.TagPolicyCreateTypeSerializer.class)
public class TagPolicyCreateType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("surfacing"));

  public static final TagPolicyCreateType SURFACING = new TagPolicyCreateType("surfacing");

  TagPolicyCreateType(String value) {
    super(value, allowedValues);
  }

  public static class TagPolicyCreateTypeSerializer extends StdSerializer<TagPolicyCreateType> {
    public TagPolicyCreateTypeSerializer(Class<TagPolicyCreateType> t) {
      super(t);
    }

    public TagPolicyCreateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TagPolicyCreateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TagPolicyCreateType fromValue(String value) {
    return new TagPolicyCreateType(value);
  }
}
