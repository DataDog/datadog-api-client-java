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
 * How <code>forward_tags_restriction_list</code> parameter should be interpreted. If <code>
 * ALLOW_LIST</code>, then only tags whose keys on the forwarded logs match the ones on the
 * restriction list are forwarded.
 *
 * <p><code>BLOCK_LIST</code> works the opposite way. It does not forward the tags matching the ones
 * on the list.
 */
@JsonSerialize(
    using =
        CustomDestinationAttributeTagsRestrictionListType
            .CustomDestinationAttributeTagsRestrictionListTypeSerializer.class)
public class CustomDestinationAttributeTagsRestrictionListType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ALLOW_LIST", "BLOCK_LIST"));

  public static final CustomDestinationAttributeTagsRestrictionListType ALLOW_LIST =
      new CustomDestinationAttributeTagsRestrictionListType("ALLOW_LIST");
  public static final CustomDestinationAttributeTagsRestrictionListType BLOCK_LIST =
      new CustomDestinationAttributeTagsRestrictionListType("BLOCK_LIST");

  CustomDestinationAttributeTagsRestrictionListType(String value) {
    super(value, allowedValues);
  }

  public static class CustomDestinationAttributeTagsRestrictionListTypeSerializer
      extends StdSerializer<CustomDestinationAttributeTagsRestrictionListType> {
    public CustomDestinationAttributeTagsRestrictionListTypeSerializer(
        Class<CustomDestinationAttributeTagsRestrictionListType> t) {
      super(t);
    }

    public CustomDestinationAttributeTagsRestrictionListTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomDestinationAttributeTagsRestrictionListType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomDestinationAttributeTagsRestrictionListType fromValue(String value) {
    return new CustomDestinationAttributeTagsRestrictionListType(value);
  }
}
