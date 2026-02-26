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

/** Google Cloud Usage Cost config resource type. */
@JsonSerialize(using = GcpUcConfigResponseDataType.GcpUcConfigResponseDataTypeSerializer.class)
public class GcpUcConfigResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gcp_uc_config"));

  public static final GcpUcConfigResponseDataType GCP_UC_CONFIG =
      new GcpUcConfigResponseDataType("gcp_uc_config");

  GcpUcConfigResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class GcpUcConfigResponseDataTypeSerializer
      extends StdSerializer<GcpUcConfigResponseDataType> {
    public GcpUcConfigResponseDataTypeSerializer(Class<GcpUcConfigResponseDataType> t) {
      super(t);
    }

    public GcpUcConfigResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GcpUcConfigResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GcpUcConfigResponseDataType fromValue(String value) {
    return new GcpUcConfigResponseDataType(value);
  }
}
