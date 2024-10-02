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

/** Type of the Synthetic test, <code>mobile</code>. */
@JsonSerialize(using = SyntheticsMobileTestType.SyntheticsMobileTestTypeSerializer.class)
public class SyntheticsMobileTestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("mobile"));

  public static final SyntheticsMobileTestType MOBILE = new SyntheticsMobileTestType("mobile");

  SyntheticsMobileTestType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileTestTypeSerializer
      extends StdSerializer<SyntheticsMobileTestType> {
    public SyntheticsMobileTestTypeSerializer(Class<SyntheticsMobileTestType> t) {
      super(t);
    }

    public SyntheticsMobileTestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileTestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileTestType fromValue(String value) {
    return new SyntheticsMobileTestType(value);
  }
}
