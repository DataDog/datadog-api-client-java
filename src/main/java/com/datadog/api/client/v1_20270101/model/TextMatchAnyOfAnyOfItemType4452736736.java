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
        TextMatchAnyOfAnyOfItemType4452736736.TextMatchAnyOfAnyOfItemType4452736736Serializer.class)
public class TextMatchAnyOfAnyOfItemType4452736736 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ends_with"));

  public static final TextMatchAnyOfAnyOfItemType4452736736 ENDS_WITH =
      new TextMatchAnyOfAnyOfItemType4452736736("ends_with");

  TextMatchAnyOfAnyOfItemType4452736736(String value) {
    super(value, allowedValues);
  }

  public static class TextMatchAnyOfAnyOfItemType4452736736Serializer
      extends StdSerializer<TextMatchAnyOfAnyOfItemType4452736736> {
    public TextMatchAnyOfAnyOfItemType4452736736Serializer(
        Class<TextMatchAnyOfAnyOfItemType4452736736> t) {
      super(t);
    }

    public TextMatchAnyOfAnyOfItemType4452736736Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        TextMatchAnyOfAnyOfItemType4452736736 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TextMatchAnyOfAnyOfItemType4452736736 fromValue(String value) {
    return new TextMatchAnyOfAnyOfItemType4452736736(value);
  }
}
