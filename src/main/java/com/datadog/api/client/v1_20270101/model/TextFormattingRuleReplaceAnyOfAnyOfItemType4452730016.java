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
        TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016
            .TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016Serializer.class)
public class TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("all"));

  public static final TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016 ALL =
      new TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016("all");

  TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016(String value) {
    super(value, allowedValues);
  }

  public static class TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016Serializer
      extends StdSerializer<TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016> {
    public TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016Serializer(
        Class<TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016> t) {
      super(t);
    }

    public TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016 fromValue(String value) {
    return new TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016(value);
  }
}
