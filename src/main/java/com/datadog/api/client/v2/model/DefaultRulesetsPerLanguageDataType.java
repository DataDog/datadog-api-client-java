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

/** Default rulesets per language resource type. */
@JsonSerialize(
    using = DefaultRulesetsPerLanguageDataType.DefaultRulesetsPerLanguageDataTypeSerializer.class)
public class DefaultRulesetsPerLanguageDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("defaultRulesetsPerLanguage"));

  public static final DefaultRulesetsPerLanguageDataType DEFAULT_RULESETS_PER_LANGUAGE =
      new DefaultRulesetsPerLanguageDataType("defaultRulesetsPerLanguage");

  DefaultRulesetsPerLanguageDataType(String value) {
    super(value, allowedValues);
  }

  public static class DefaultRulesetsPerLanguageDataTypeSerializer
      extends StdSerializer<DefaultRulesetsPerLanguageDataType> {
    public DefaultRulesetsPerLanguageDataTypeSerializer(
        Class<DefaultRulesetsPerLanguageDataType> t) {
      super(t);
    }

    public DefaultRulesetsPerLanguageDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DefaultRulesetsPerLanguageDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DefaultRulesetsPerLanguageDataType fromValue(String value) {
    return new DefaultRulesetsPerLanguageDataType(value);
  }
}
