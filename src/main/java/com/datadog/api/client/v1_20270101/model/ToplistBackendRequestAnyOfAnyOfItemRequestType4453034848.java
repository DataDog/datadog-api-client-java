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
        ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848
            .ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848Serializer.class)
public class ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ddsql"));

  public static final ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848 DDSQL =
      new ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848("ddsql");

  ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848(String value) {
    super(value, allowedValues);
  }

  public static class ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848Serializer
      extends StdSerializer<ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848> {
    public ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848Serializer(
        Class<ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848> t) {
      super(t);
    }

    public ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848 fromValue(String value) {
    return new ToplistBackendRequestAnyOfAnyOfItemRequestType4453034848(value);
  }
}
