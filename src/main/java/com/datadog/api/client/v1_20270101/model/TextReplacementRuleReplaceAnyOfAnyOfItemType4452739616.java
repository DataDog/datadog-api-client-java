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
        TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616
            .TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616Serializer.class)
public class TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("all"));

  public static final TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616 ALL =
      new TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616("all");

  TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616(String value) {
    super(value, allowedValues);
  }

  public static class TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616Serializer
      extends StdSerializer<TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616> {
    public TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616Serializer(
        Class<TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616> t) {
      super(t);
    }

    public TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616 fromValue(String value) {
    return new TextReplacementRuleReplaceAnyOfAnyOfItemType4452739616(value);
  }
}
