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
        ToplistBackendRequestAnyOfAnyOfItemRequestType
            .ToplistBackendRequestAnyOfAnyOfItemRequestTypeSerializer.class)
public class ToplistBackendRequestAnyOfAnyOfItemRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("advanced_query"));

  public static final ToplistBackendRequestAnyOfAnyOfItemRequestType ADVANCED_QUERY =
      new ToplistBackendRequestAnyOfAnyOfItemRequestType("advanced_query");

  ToplistBackendRequestAnyOfAnyOfItemRequestType(String value) {
    super(value, allowedValues);
  }

  public static class ToplistBackendRequestAnyOfAnyOfItemRequestTypeSerializer
      extends StdSerializer<ToplistBackendRequestAnyOfAnyOfItemRequestType> {
    public ToplistBackendRequestAnyOfAnyOfItemRequestTypeSerializer(
        Class<ToplistBackendRequestAnyOfAnyOfItemRequestType> t) {
      super(t);
    }

    public ToplistBackendRequestAnyOfAnyOfItemRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendRequestAnyOfAnyOfItemRequestType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistBackendRequestAnyOfAnyOfItemRequestType fromValue(String value) {
    return new ToplistBackendRequestAnyOfAnyOfItemRequestType(value);
  }
}
