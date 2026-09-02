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

/** Type of the version metadata resource. */
@JsonSerialize(
    using = SyntheticsTestVersionChangeType.SyntheticsTestVersionChangeTypeSerializer.class)
public class SyntheticsTestVersionChangeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("version_metadata"));

  public static final SyntheticsTestVersionChangeType VERSION_METADATA =
      new SyntheticsTestVersionChangeType("version_metadata");

  SyntheticsTestVersionChangeType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestVersionChangeTypeSerializer
      extends StdSerializer<SyntheticsTestVersionChangeType> {
    public SyntheticsTestVersionChangeTypeSerializer(Class<SyntheticsTestVersionChangeType> t) {
      super(t);
    }

    public SyntheticsTestVersionChangeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestVersionChangeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestVersionChangeType fromValue(String value) {
    return new SyntheticsTestVersionChangeType(value);
  }
}
