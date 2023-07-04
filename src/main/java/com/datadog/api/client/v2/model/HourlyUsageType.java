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

/** Usage type that is being measured. */
@JsonSerialize(using = HourlyUsageType.HourlyUsageTypeSerializer.class)
public class HourlyUsageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "app_sec_host_count",
              "observability_pipelines_bytes_processed",
              "lambda_traced_invocations_count"));

  public static final HourlyUsageType APP_SEC_HOST_COUNT =
      new HourlyUsageType("app_sec_host_count");
  public static final HourlyUsageType OBSERVABILITY_PIPELINES_BYTES_PROCESSSED =
      new HourlyUsageType("observability_pipelines_bytes_processed");
  public static final HourlyUsageType LAMBDA_TRACED_INVOCATIONS_COUNT =
      new HourlyUsageType("lambda_traced_invocations_count");

  HourlyUsageType(String value) {
    super(value, allowedValues);
  }

  public static class HourlyUsageTypeSerializer extends StdSerializer<HourlyUsageType> {
    public HourlyUsageTypeSerializer(Class<HourlyUsageType> t) {
      super(t);
    }

    public HourlyUsageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(HourlyUsageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HourlyUsageType fromValue(String value) {
    return new HourlyUsageType(value);
  }
}
