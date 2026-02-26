/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of a user locator. */
@JsonSerialize(
    using =
        SyntheticsMobileStepParamsElementUserLocatorValuesItemsType
            .SyntheticsMobileStepParamsElementUserLocatorValuesItemsTypeSerializer.class)
public class SyntheticsMobileStepParamsElementUserLocatorValuesItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "accessibility-id", "id", "ios-predicate-string", "ios-class-chain", "xpath"));

  public static final SyntheticsMobileStepParamsElementUserLocatorValuesItemsType ACCESSIBILITY_ID =
      new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType("accessibility-id");
  public static final SyntheticsMobileStepParamsElementUserLocatorValuesItemsType ID =
      new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType("id");
  public static final SyntheticsMobileStepParamsElementUserLocatorValuesItemsType
      IOS_PREDICATE_STRING =
          new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType("ios-predicate-string");
  public static final SyntheticsMobileStepParamsElementUserLocatorValuesItemsType IOS_CLASS_CHAIN =
      new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType("ios-class-chain");
  public static final SyntheticsMobileStepParamsElementUserLocatorValuesItemsType XPATH =
      new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType("xpath");

  SyntheticsMobileStepParamsElementUserLocatorValuesItemsType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileStepParamsElementUserLocatorValuesItemsTypeSerializer
      extends StdSerializer<SyntheticsMobileStepParamsElementUserLocatorValuesItemsType> {
    public SyntheticsMobileStepParamsElementUserLocatorValuesItemsTypeSerializer(
        Class<SyntheticsMobileStepParamsElementUserLocatorValuesItemsType> t) {
      super(t);
    }

    public SyntheticsMobileStepParamsElementUserLocatorValuesItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileStepParamsElementUserLocatorValuesItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileStepParamsElementUserLocatorValuesItemsType fromValue(
      String value) {
    return new SyntheticsMobileStepParamsElementUserLocatorValuesItemsType(value);
  }
}
