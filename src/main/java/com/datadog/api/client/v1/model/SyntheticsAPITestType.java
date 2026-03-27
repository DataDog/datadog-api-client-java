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

/** Type of the Synthetic test, <code>api</code>. */
@JsonSerialize(using = SyntheticsAPITestType.SyntheticsAPITestTypeSerializer.class)
public class SyntheticsAPITestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("api"));

  public static final SyntheticsAPITestType API = new SyntheticsAPITestType("api");

  SyntheticsAPITestType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAPITestTypeSerializer extends StdSerializer<SyntheticsAPITestType> {
    public SyntheticsAPITestTypeSerializer(Class<SyntheticsAPITestType> t) {
      super(t);
    }

    public SyntheticsAPITestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAPITestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAPITestType fromValue(String value) {
    return new SyntheticsAPITestType(value);
  }
}
