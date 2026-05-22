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

/** PagerDuty service resource type. */
@JsonSerialize(using = IncidentPagerdutyServiceType.IncidentPagerdutyServiceTypeSerializer.class)
public class IncidentPagerdutyServiceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pagerduty_service"));

  public static final IncidentPagerdutyServiceType PAGERDUTY_SERVICE =
      new IncidentPagerdutyServiceType("pagerduty_service");

  IncidentPagerdutyServiceType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentPagerdutyServiceTypeSerializer
      extends StdSerializer<IncidentPagerdutyServiceType> {
    public IncidentPagerdutyServiceTypeSerializer(Class<IncidentPagerdutyServiceType> t) {
      super(t);
    }

    public IncidentPagerdutyServiceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentPagerdutyServiceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentPagerdutyServiceType fromValue(String value) {
    return new IncidentPagerdutyServiceType(value);
  }
}
