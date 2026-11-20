/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088
            .TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088Serializer.class)
public class TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 SCALAR =
      new TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088("scalar");

  TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088(String value) {
    super(value, allowedValues);
  }

  public static class TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088Serializer
      extends StdSerializer<TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088> {
    public TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088Serializer(
        Class<TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088> t) {
      super(t);
    }

    public TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088 fromValue(
      String value) {
    return new TreemapBackendRequestAnyOfAnyOfItemResponseFormat4453529088(value);
  }
}
