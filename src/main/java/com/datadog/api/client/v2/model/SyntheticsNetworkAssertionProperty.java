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

/** The associated assertion property. */
@JsonSerialize(
    using = SyntheticsNetworkAssertionProperty.SyntheticsNetworkAssertionPropertySerializer.class)
public class SyntheticsNetworkAssertionProperty extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "max", "min"));

  public static final SyntheticsNetworkAssertionProperty AVG =
      new SyntheticsNetworkAssertionProperty("avg");
  public static final SyntheticsNetworkAssertionProperty MAX =
      new SyntheticsNetworkAssertionProperty("max");
  public static final SyntheticsNetworkAssertionProperty MIN =
      new SyntheticsNetworkAssertionProperty("min");

  SyntheticsNetworkAssertionProperty(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkAssertionPropertySerializer
      extends StdSerializer<SyntheticsNetworkAssertionProperty> {
    public SyntheticsNetworkAssertionPropertySerializer(
        Class<SyntheticsNetworkAssertionProperty> t) {
      super(t);
    }

    public SyntheticsNetworkAssertionPropertySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkAssertionProperty value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkAssertionProperty fromValue(String value) {
    return new SyntheticsNetworkAssertionProperty(value);
  }
}
