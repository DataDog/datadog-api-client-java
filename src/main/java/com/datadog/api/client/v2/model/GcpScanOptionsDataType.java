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

/** GCP scan options resource type. */
@JsonSerialize(using = GcpScanOptionsDataType.GcpScanOptionsDataTypeSerializer.class)
public class GcpScanOptionsDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gcp_scan_options"));

  public static final GcpScanOptionsDataType GCP_SCAN_OPTIONS =
      new GcpScanOptionsDataType("gcp_scan_options");

  GcpScanOptionsDataType(String value) {
    super(value, allowedValues);
  }

  public static class GcpScanOptionsDataTypeSerializer
      extends StdSerializer<GcpScanOptionsDataType> {
    public GcpScanOptionsDataTypeSerializer(Class<GcpScanOptionsDataType> t) {
      super(t);
    }

    public GcpScanOptionsDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GcpScanOptionsDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GcpScanOptionsDataType fromValue(String value) {
    return new GcpScanOptionsDataType(value);
  }
}
