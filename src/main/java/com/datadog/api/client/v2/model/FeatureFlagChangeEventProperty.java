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

/** The part of the feature flag the change applies to. */
@JsonSerialize(
    using = FeatureFlagChangeEventProperty.FeatureFlagChangeEventPropertySerializer.class)
public class FeatureFlagChangeEventProperty extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "FLAG",
              "FLAG_NAME",
              "FLAG_DESCRIPTION",
              "JSON_SCHEMA",
              "DISTRIBUTION_CHANNEL",
              "REQUIRE_APPROVAL",
              "VARIANT",
              "VARIANT_NAME",
              "VARIANT_VALUE",
              "ALLOCATIONS",
              "ROLLOUT",
              "ENVIRONMENT_STATUS",
              "DEFAULT_VARIANT",
              "OVERRIDE_VARIANT",
              "STALENESS_STATUS",
              "SAVED_FILTER"));

  public static final FeatureFlagChangeEventProperty FLAG =
      new FeatureFlagChangeEventProperty("FLAG");
  public static final FeatureFlagChangeEventProperty FLAG_NAME =
      new FeatureFlagChangeEventProperty("FLAG_NAME");
  public static final FeatureFlagChangeEventProperty FLAG_DESCRIPTION =
      new FeatureFlagChangeEventProperty("FLAG_DESCRIPTION");
  public static final FeatureFlagChangeEventProperty JSON_SCHEMA =
      new FeatureFlagChangeEventProperty("JSON_SCHEMA");
  public static final FeatureFlagChangeEventProperty DISTRIBUTION_CHANNEL =
      new FeatureFlagChangeEventProperty("DISTRIBUTION_CHANNEL");
  public static final FeatureFlagChangeEventProperty REQUIRE_APPROVAL =
      new FeatureFlagChangeEventProperty("REQUIRE_APPROVAL");
  public static final FeatureFlagChangeEventProperty VARIANT =
      new FeatureFlagChangeEventProperty("VARIANT");
  public static final FeatureFlagChangeEventProperty VARIANT_NAME =
      new FeatureFlagChangeEventProperty("VARIANT_NAME");
  public static final FeatureFlagChangeEventProperty VARIANT_VALUE =
      new FeatureFlagChangeEventProperty("VARIANT_VALUE");
  public static final FeatureFlagChangeEventProperty ALLOCATIONS =
      new FeatureFlagChangeEventProperty("ALLOCATIONS");
  public static final FeatureFlagChangeEventProperty ROLLOUT =
      new FeatureFlagChangeEventProperty("ROLLOUT");
  public static final FeatureFlagChangeEventProperty ENVIRONMENT_STATUS =
      new FeatureFlagChangeEventProperty("ENVIRONMENT_STATUS");
  public static final FeatureFlagChangeEventProperty DEFAULT_VARIANT =
      new FeatureFlagChangeEventProperty("DEFAULT_VARIANT");
  public static final FeatureFlagChangeEventProperty OVERRIDE_VARIANT =
      new FeatureFlagChangeEventProperty("OVERRIDE_VARIANT");
  public static final FeatureFlagChangeEventProperty STALENESS_STATUS =
      new FeatureFlagChangeEventProperty("STALENESS_STATUS");
  public static final FeatureFlagChangeEventProperty SAVED_FILTER =
      new FeatureFlagChangeEventProperty("SAVED_FILTER");

  FeatureFlagChangeEventProperty(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventPropertySerializer
      extends StdSerializer<FeatureFlagChangeEventProperty> {
    public FeatureFlagChangeEventPropertySerializer(Class<FeatureFlagChangeEventProperty> t) {
      super(t);
    }

    public FeatureFlagChangeEventPropertySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventProperty value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventProperty fromValue(String value) {
    return new FeatureFlagChangeEventProperty(value);
  }
}
