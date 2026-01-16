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

/** Rule severity */
@JsonSerialize(
    using =
        CustomRuleRevisionAttributesSeverity.CustomRuleRevisionAttributesSeveritySerializer.class)
public class CustomRuleRevisionAttributesSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ERROR", "WARNING", "NOTICE"));

  public static final CustomRuleRevisionAttributesSeverity ERROR =
      new CustomRuleRevisionAttributesSeverity("ERROR");
  public static final CustomRuleRevisionAttributesSeverity WARNING =
      new CustomRuleRevisionAttributesSeverity("WARNING");
  public static final CustomRuleRevisionAttributesSeverity NOTICE =
      new CustomRuleRevisionAttributesSeverity("NOTICE");

  CustomRuleRevisionAttributesSeverity(String value) {
    super(value, allowedValues);
  }

  public static class CustomRuleRevisionAttributesSeveritySerializer
      extends StdSerializer<CustomRuleRevisionAttributesSeverity> {
    public CustomRuleRevisionAttributesSeveritySerializer(
        Class<CustomRuleRevisionAttributesSeverity> t) {
      super(t);
    }

    public CustomRuleRevisionAttributesSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomRuleRevisionAttributesSeverity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomRuleRevisionAttributesSeverity fromValue(String value) {
    return new CustomRuleRevisionAttributesSeverity(value);
  }
}
