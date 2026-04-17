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

/** The flag property being changed. */
@JsonSerialize(using = FlagSuggestionProperty.FlagSuggestionPropertySerializer.class)
public class FlagSuggestionProperty extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "FLAG",
              "FLAG_NAME",
              "FLAG_DESCRIPTION",
              "JSON_SCHEMA",
              "DISTRIBUTION_CHANNEL",
              "VARIANT",
              "VARIANT_NAME",
              "VARIANT_VALUE",
              "ALLOCATIONS",
              "ROLLOUT",
              "ENVIRONMENT_STATUS",
              "DEFAULT_VARIANT",
              "OVERRIDE_VARIANT"));

  public static final FlagSuggestionProperty FLAG = new FlagSuggestionProperty("FLAG");
  public static final FlagSuggestionProperty FLAG_NAME = new FlagSuggestionProperty("FLAG_NAME");
  public static final FlagSuggestionProperty FLAG_DESCRIPTION =
      new FlagSuggestionProperty("FLAG_DESCRIPTION");
  public static final FlagSuggestionProperty JSON_SCHEMA =
      new FlagSuggestionProperty("JSON_SCHEMA");
  public static final FlagSuggestionProperty DISTRIBUTION_CHANNEL =
      new FlagSuggestionProperty("DISTRIBUTION_CHANNEL");
  public static final FlagSuggestionProperty VARIANT = new FlagSuggestionProperty("VARIANT");
  public static final FlagSuggestionProperty VARIANT_NAME =
      new FlagSuggestionProperty("VARIANT_NAME");
  public static final FlagSuggestionProperty VARIANT_VALUE =
      new FlagSuggestionProperty("VARIANT_VALUE");
  public static final FlagSuggestionProperty ALLOCATIONS =
      new FlagSuggestionProperty("ALLOCATIONS");
  public static final FlagSuggestionProperty ROLLOUT = new FlagSuggestionProperty("ROLLOUT");
  public static final FlagSuggestionProperty ENVIRONMENT_STATUS =
      new FlagSuggestionProperty("ENVIRONMENT_STATUS");
  public static final FlagSuggestionProperty DEFAULT_VARIANT =
      new FlagSuggestionProperty("DEFAULT_VARIANT");
  public static final FlagSuggestionProperty OVERRIDE_VARIANT =
      new FlagSuggestionProperty("OVERRIDE_VARIANT");

  FlagSuggestionProperty(String value) {
    super(value, allowedValues);
  }

  public static class FlagSuggestionPropertySerializer
      extends StdSerializer<FlagSuggestionProperty> {
    public FlagSuggestionPropertySerializer(Class<FlagSuggestionProperty> t) {
      super(t);
    }

    public FlagSuggestionPropertySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlagSuggestionProperty value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlagSuggestionProperty fromValue(String value) {
    return new FlagSuggestionProperty(value);
  }
}
