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
        ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448
            .ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448Serializer.class)
public class ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("flat"));

  public static final ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448 FLAT =
      new ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448("flat");

  ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448(String value) {
    super(value, allowedValues);
  }

  public static class ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448Serializer
      extends StdSerializer<ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448> {
    public ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448Serializer(
        Class<ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448> t) {
      super(t);
    }

    public ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448 fromValue(
      String value) {
    return new ToplistBackendDefinitionStyleDisplayAnyOfAnyOfItemType4453028448(value);
  }
}
