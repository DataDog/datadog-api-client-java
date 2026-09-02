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

/** Priority of the Salesforce incident created from this template. */
@JsonSerialize(
    using = SalesforceIncidentsTemplatePriority.SalesforceIncidentsTemplatePrioritySerializer.class)
public class SalesforceIncidentsTemplatePriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("Critical", "High", "Moderate", "Low"));

  public static final SalesforceIncidentsTemplatePriority CRITICAL =
      new SalesforceIncidentsTemplatePriority("Critical");
  public static final SalesforceIncidentsTemplatePriority HIGH =
      new SalesforceIncidentsTemplatePriority("High");
  public static final SalesforceIncidentsTemplatePriority MODERATE =
      new SalesforceIncidentsTemplatePriority("Moderate");
  public static final SalesforceIncidentsTemplatePriority LOW =
      new SalesforceIncidentsTemplatePriority("Low");

  SalesforceIncidentsTemplatePriority(String value) {
    super(value, allowedValues);
  }

  public static class SalesforceIncidentsTemplatePrioritySerializer
      extends StdSerializer<SalesforceIncidentsTemplatePriority> {
    public SalesforceIncidentsTemplatePrioritySerializer(
        Class<SalesforceIncidentsTemplatePriority> t) {
      super(t);
    }

    public SalesforceIncidentsTemplatePrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SalesforceIncidentsTemplatePriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SalesforceIncidentsTemplatePriority fromValue(String value) {
    return new SalesforceIncidentsTemplatePriority(value);
  }
}
