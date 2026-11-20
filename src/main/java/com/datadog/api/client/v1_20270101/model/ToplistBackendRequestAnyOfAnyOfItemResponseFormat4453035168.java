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
        ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168
            .ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168Serializer.class)
public class ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168 SCALAR =
      new ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168("scalar");

  ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168(String value) {
    super(value, allowedValues);
  }

  public static class ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168Serializer
      extends StdSerializer<ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168> {
    public ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168Serializer(
        Class<ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168> t) {
      super(t);
    }

    public ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168 fromValue(
      String value) {
    return new ToplistBackendRequestAnyOfAnyOfItemResponseFormat4453035168(value);
  }
}
