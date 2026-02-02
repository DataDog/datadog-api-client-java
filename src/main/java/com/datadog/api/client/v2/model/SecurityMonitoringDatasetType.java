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

/** Type for security monitoring dataset objects. */
@JsonSerialize(using = SecurityMonitoringDatasetType.SecurityMonitoringDatasetTypeSerializer.class)
public class SecurityMonitoringDatasetType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_monitoring_dataset"));

  public static final SecurityMonitoringDatasetType SECURITY_MONITORING_DATASET =
      new SecurityMonitoringDatasetType("security_monitoring_dataset");

  SecurityMonitoringDatasetType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringDatasetTypeSerializer
      extends StdSerializer<SecurityMonitoringDatasetType> {
    public SecurityMonitoringDatasetTypeSerializer(Class<SecurityMonitoringDatasetType> t) {
      super(t);
    }

    public SecurityMonitoringDatasetTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringDatasetType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringDatasetType fromValue(String value) {
    return new SecurityMonitoringDatasetType(value);
  }
}
