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

/** The resource type for a Synthetics downtime. */
@JsonSerialize(
    using = SyntheticsDowntimeResourceType.SyntheticsDowntimeResourceTypeSerializer.class)
public class SyntheticsDowntimeResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("downtime"));

  public static final SyntheticsDowntimeResourceType DOWNTIME =
      new SyntheticsDowntimeResourceType("downtime");

  SyntheticsDowntimeResourceType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsDowntimeResourceTypeSerializer
      extends StdSerializer<SyntheticsDowntimeResourceType> {
    public SyntheticsDowntimeResourceTypeSerializer(Class<SyntheticsDowntimeResourceType> t) {
      super(t);
    }

    public SyntheticsDowntimeResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsDowntimeResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsDowntimeResourceType fromValue(String value) {
    return new SyntheticsDowntimeResourceType(value);
  }
}
