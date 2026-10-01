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

/** The experience type of the dashboard. */
@JsonSerialize(using = DashboardExperienceType.DashboardExperienceTypeSerializer.class)
public class DashboardExperienceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "product_analytics"));

  public static final DashboardExperienceType DEFAULT = new DashboardExperienceType("default");
  public static final DashboardExperienceType PRODUCT_ANALYTICS =
      new DashboardExperienceType("product_analytics");

  DashboardExperienceType(String value) {
    super(value, allowedValues);
  }

  public static class DashboardExperienceTypeSerializer
      extends StdSerializer<DashboardExperienceType> {
    public DashboardExperienceTypeSerializer(Class<DashboardExperienceType> t) {
      super(t);
    }

    public DashboardExperienceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardExperienceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardExperienceType fromValue(String value) {
    return new DashboardExperienceType(value);
  }
}
