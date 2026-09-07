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

/** The type of dashboard resource the report schedule targets. */
@JsonSerialize(using = ReportScheduleResourceType.ReportScheduleResourceTypeSerializer.class)
public class ReportScheduleResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dashboard", "integration_dashboard"));

  public static final ReportScheduleResourceType DASHBOARD =
      new ReportScheduleResourceType("dashboard");
  public static final ReportScheduleResourceType INTEGRATION_DASHBOARD =
      new ReportScheduleResourceType("integration_dashboard");

  ReportScheduleResourceType(String value) {
    super(value, allowedValues);
  }

  public static class ReportScheduleResourceTypeSerializer
      extends StdSerializer<ReportScheduleResourceType> {
    public ReportScheduleResourceTypeSerializer(Class<ReportScheduleResourceType> t) {
      super(t);
    }

    public ReportScheduleResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReportScheduleResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReportScheduleResourceType fromValue(String value) {
    return new ReportScheduleResourceType(value);
  }
}
