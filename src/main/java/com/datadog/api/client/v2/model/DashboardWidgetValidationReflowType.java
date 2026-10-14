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

/** Reflow behavior used for an ordered dashboard. */
@JsonSerialize(
    using = DashboardWidgetValidationReflowType.DashboardWidgetValidationReflowTypeSerializer.class)
public class DashboardWidgetValidationReflowType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "fixed"));

  public static final DashboardWidgetValidationReflowType AUTO =
      new DashboardWidgetValidationReflowType("auto");
  public static final DashboardWidgetValidationReflowType FIXED =
      new DashboardWidgetValidationReflowType("fixed");

  DashboardWidgetValidationReflowType(String value) {
    super(value, allowedValues);
  }

  public static class DashboardWidgetValidationReflowTypeSerializer
      extends StdSerializer<DashboardWidgetValidationReflowType> {
    public DashboardWidgetValidationReflowTypeSerializer(
        Class<DashboardWidgetValidationReflowType> t) {
      super(t);
    }

    public DashboardWidgetValidationReflowTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardWidgetValidationReflowType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardWidgetValidationReflowType fromValue(String value) {
    return new DashboardWidgetValidationReflowType(value);
  }
}
