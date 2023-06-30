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

/** Error type returned by a browser test. */
@JsonSerialize(using = SyntheticsBrowserErrorType.SyntheticsBrowserErrorTypeSerializer.class)
public class SyntheticsBrowserErrorType extends ModelEnum<String> {

  public static final SyntheticsBrowserErrorType NETWORK =
      new SyntheticsBrowserErrorType("network");
  public static final SyntheticsBrowserErrorType JS = new SyntheticsBrowserErrorType("js");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("network", "js"));

  SyntheticsBrowserErrorType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SyntheticsBrowserErrorTypeSerializer
      extends StdSerializer<SyntheticsBrowserErrorType> {
    public SyntheticsBrowserErrorTypeSerializer(Class<SyntheticsBrowserErrorType> t) {
      super(t);
    }

    public SyntheticsBrowserErrorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsBrowserErrorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsBrowserErrorType fromValue(String value) {
    return new SyntheticsBrowserErrorType(value);
  }
}
