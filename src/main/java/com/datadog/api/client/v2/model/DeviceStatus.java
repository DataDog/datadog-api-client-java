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

/**
 * Health status of the device, computed from its issues and recent telemetry. <code>inactive</code>
 * means the device stopped reporting. <code>unknown</code> means no telemetry is available yet.
 */
@JsonSerialize(using = DeviceStatus.DeviceStatusSerializer.class)
public class DeviceStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("healthy", "degraded", "critical", "inactive", "unknown"));

  public static final DeviceStatus HEALTHY = new DeviceStatus("healthy");
  public static final DeviceStatus DEGRADED = new DeviceStatus("degraded");
  public static final DeviceStatus CRITICAL = new DeviceStatus("critical");
  public static final DeviceStatus INACTIVE = new DeviceStatus("inactive");
  public static final DeviceStatus UNKNOWN = new DeviceStatus("unknown");

  DeviceStatus(String value) {
    super(value, allowedValues);
  }

  public static class DeviceStatusSerializer extends StdSerializer<DeviceStatus> {
    public DeviceStatusSerializer(Class<DeviceStatus> t) {
      super(t);
    }

    public DeviceStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(DeviceStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeviceStatus fromValue(String value) {
    return new DeviceStatus(value);
  }
}
