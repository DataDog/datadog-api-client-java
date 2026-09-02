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

/** Type of the Synthetic test, <code>browser</code>. */
@JsonSerialize(using = SyntheticsBrowserTestType.SyntheticsBrowserTestTypeSerializer.class)
public class SyntheticsBrowserTestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("browser"));

  public static final SyntheticsBrowserTestType BROWSER = new SyntheticsBrowserTestType("browser");

  SyntheticsBrowserTestType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsBrowserTestTypeSerializer
      extends StdSerializer<SyntheticsBrowserTestType> {
    public SyntheticsBrowserTestTypeSerializer(Class<SyntheticsBrowserTestType> t) {
      super(t);
    }

    public SyntheticsBrowserTestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBrowserTestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBrowserTestType fromValue(String value) {
    return new SyntheticsBrowserTestType(value);
  }
}
