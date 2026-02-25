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

/** Widget experience types that differentiate between the products using the specific widget. */
@JsonSerialize(using = WidgetExperienceType.WidgetExperienceTypeSerializer.class)
public class WidgetExperienceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("ccm_reports", "logs_reports", "csv_reports", "product_analytics"));

  public static final WidgetExperienceType CCM_REPORTS = new WidgetExperienceType("ccm_reports");
  public static final WidgetExperienceType LOGS_REPORTS = new WidgetExperienceType("logs_reports");
  public static final WidgetExperienceType CSV_REPORTS = new WidgetExperienceType("csv_reports");
  public static final WidgetExperienceType PRODUCT_ANALYTICS =
      new WidgetExperienceType("product_analytics");

  WidgetExperienceType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetExperienceTypeSerializer extends StdSerializer<WidgetExperienceType> {
    public WidgetExperienceTypeSerializer(Class<WidgetExperienceType> t) {
      super(t);
    }

    public WidgetExperienceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetExperienceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetExperienceType fromValue(String value) {
    return new WidgetExperienceType(value);
  }
}
