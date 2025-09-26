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

/** The GCP monitored resource type. Only a subset of resource types are supported. */
@JsonSerialize(
    using = GCPMonitoredResourceConfigType.GCPMonitoredResourceConfigTypeSerializer.class)
public class GCPMonitoredResourceConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cloud_function", "cloud_run_revision", "gce_instance"));

  public static final GCPMonitoredResourceConfigType CLOUD_FUNCTION =
      new GCPMonitoredResourceConfigType("cloud_function");
  public static final GCPMonitoredResourceConfigType CLOUD_RUN_REVISION =
      new GCPMonitoredResourceConfigType("cloud_run_revision");
  public static final GCPMonitoredResourceConfigType GCE_INSTANCE =
      new GCPMonitoredResourceConfigType("gce_instance");

  GCPMonitoredResourceConfigType(String value) {
    super(value, allowedValues);
  }

  public static class GCPMonitoredResourceConfigTypeSerializer
      extends StdSerializer<GCPMonitoredResourceConfigType> {
    public GCPMonitoredResourceConfigTypeSerializer(Class<GCPMonitoredResourceConfigType> t) {
      super(t);
    }

    public GCPMonitoredResourceConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPMonitoredResourceConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPMonitoredResourceConfigType fromValue(String value) {
    return new GCPMonitoredResourceConfigType(value);
  }
}
