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

/** The type of the resource. The value should always be <code>aws_scan_options</code>. */
@JsonSerialize(using = AwsScanOptionsType.AwsScanOptionsTypeSerializer.class)
public class AwsScanOptionsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws_scan_options"));

  public static final AwsScanOptionsType AWS_SCAN_OPTIONS =
      new AwsScanOptionsType("aws_scan_options");

  AwsScanOptionsType(String value) {
    super(value, allowedValues);
  }

  public static class AwsScanOptionsTypeSerializer extends StdSerializer<AwsScanOptionsType> {
    public AwsScanOptionsTypeSerializer(Class<AwsScanOptionsType> t) {
      super(t);
    }

    public AwsScanOptionsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AwsScanOptionsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AwsScanOptionsType fromValue(String value) {
    return new AwsScanOptionsType(value);
  }
}
