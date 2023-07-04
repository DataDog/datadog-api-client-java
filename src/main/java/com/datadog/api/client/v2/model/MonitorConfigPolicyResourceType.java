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

/** Monitor configuration policy resource type. */
@JsonSerialize(
    using = MonitorConfigPolicyResourceType.MonitorConfigPolicyResourceTypeSerializer.class)
public class MonitorConfigPolicyResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("monitor-config-policy"));

  public static final MonitorConfigPolicyResourceType MONITOR_CONFIG_POLICY =
      new MonitorConfigPolicyResourceType("monitor-config-policy");

  MonitorConfigPolicyResourceType(String value) {
    super(value, allowedValues);
  }

  public static class MonitorConfigPolicyResourceTypeSerializer
      extends StdSerializer<MonitorConfigPolicyResourceType> {
    public MonitorConfigPolicyResourceTypeSerializer(Class<MonitorConfigPolicyResourceType> t) {
      super(t);
    }

    public MonitorConfigPolicyResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorConfigPolicyResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorConfigPolicyResourceType fromValue(String value) {
    return new MonitorConfigPolicyResourceType(value);
  }
}
