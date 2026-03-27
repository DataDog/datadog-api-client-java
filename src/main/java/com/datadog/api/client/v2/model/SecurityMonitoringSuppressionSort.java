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

/** The sort parameters used for querying suppression rules. */
@JsonSerialize(
    using = SecurityMonitoringSuppressionSort.SecurityMonitoringSuppressionSortSerializer.class)
public class SecurityMonitoringSuppressionSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "name",
              "start_date",
              "expiration_date",
              "update_date",
              "enabled",
              "-name",
              "-start_date",
              "-expiration_date",
              "-update_date",
              "-creation_date",
              "-enabled"));

  public static final SecurityMonitoringSuppressionSort NAME =
      new SecurityMonitoringSuppressionSort("name");
  public static final SecurityMonitoringSuppressionSort START_DATE =
      new SecurityMonitoringSuppressionSort("start_date");
  public static final SecurityMonitoringSuppressionSort EXPIRATION_DATE =
      new SecurityMonitoringSuppressionSort("expiration_date");
  public static final SecurityMonitoringSuppressionSort UPDATE_DATE =
      new SecurityMonitoringSuppressionSort("update_date");
  public static final SecurityMonitoringSuppressionSort ENABLED =
      new SecurityMonitoringSuppressionSort("enabled");
  public static final SecurityMonitoringSuppressionSort NAME_DESCENDING =
      new SecurityMonitoringSuppressionSort("-name");
  public static final SecurityMonitoringSuppressionSort START_DATE_DESCENDING =
      new SecurityMonitoringSuppressionSort("-start_date");
  public static final SecurityMonitoringSuppressionSort EXPIRATION_DATE_DESCENDING =
      new SecurityMonitoringSuppressionSort("-expiration_date");
  public static final SecurityMonitoringSuppressionSort UPDATE_DATE_DESCENDING =
      new SecurityMonitoringSuppressionSort("-update_date");
  public static final SecurityMonitoringSuppressionSort CREATION_DATE_DESCENDING =
      new SecurityMonitoringSuppressionSort("-creation_date");
  public static final SecurityMonitoringSuppressionSort ENABLED_DESCENDING =
      new SecurityMonitoringSuppressionSort("-enabled");

  SecurityMonitoringSuppressionSort(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSuppressionSortSerializer
      extends StdSerializer<SecurityMonitoringSuppressionSort> {
    public SecurityMonitoringSuppressionSortSerializer(Class<SecurityMonitoringSuppressionSort> t) {
      super(t);
    }

    public SecurityMonitoringSuppressionSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSuppressionSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSuppressionSort fromValue(String value) {
    return new SecurityMonitoringSuppressionSort(value);
  }
}
