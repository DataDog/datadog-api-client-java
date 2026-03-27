/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The different statuses for which renotification is supported. */
@JsonSerialize(using = MonitorRenotifyStatusType.MonitorRenotifyStatusTypeSerializer.class)
public class MonitorRenotifyStatusType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert", "warn", "no data"));

  public static final MonitorRenotifyStatusType ALERT = new MonitorRenotifyStatusType("alert");
  public static final MonitorRenotifyStatusType WARN = new MonitorRenotifyStatusType("warn");
  public static final MonitorRenotifyStatusType NO_DATA = new MonitorRenotifyStatusType("no data");

  MonitorRenotifyStatusType(String value) {
    super(value, allowedValues);
  }

  public static class MonitorRenotifyStatusTypeSerializer
      extends StdSerializer<MonitorRenotifyStatusType> {
    public MonitorRenotifyStatusTypeSerializer(Class<MonitorRenotifyStatusType> t) {
      super(t);
    }

    public MonitorRenotifyStatusTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorRenotifyStatusType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorRenotifyStatusType fromValue(String value) {
    return new MonitorRenotifyStatusType(value);
  }
}
