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

/** The type of the flaky test from Flaky Test Management. */
@JsonSerialize(using = FlakyTestType.FlakyTestTypeSerializer.class)
public class FlakyTestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("flaky_test"));

  public static final FlakyTestType FLAKY_TEST = new FlakyTestType("flaky_test");

  FlakyTestType(String value) {
    super(value, allowedValues);
  }

  public static class FlakyTestTypeSerializer extends StdSerializer<FlakyTestType> {
    public FlakyTestTypeSerializer(Class<FlakyTestType> t) {
      super(t);
    }

    public FlakyTestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(FlakyTestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlakyTestType fromValue(String value) {
    return new FlakyTestType(value);
  }
}
