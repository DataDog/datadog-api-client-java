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

/** Salesforce incident template resource type. */
@JsonSerialize(
    using = SalesforceIncidentsTemplateType.SalesforceIncidentsTemplateTypeSerializer.class)
public class SalesforceIncidentsTemplateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("salesforce-incidents-incident-template"));

  public static final SalesforceIncidentsTemplateType SALESFORCE_INCIDENTS_INCIDENT_TEMPLATE =
      new SalesforceIncidentsTemplateType("salesforce-incidents-incident-template");

  SalesforceIncidentsTemplateType(String value) {
    super(value, allowedValues);
  }

  public static class SalesforceIncidentsTemplateTypeSerializer
      extends StdSerializer<SalesforceIncidentsTemplateType> {
    public SalesforceIncidentsTemplateTypeSerializer(Class<SalesforceIncidentsTemplateType> t) {
      super(t);
    }

    public SalesforceIncidentsTemplateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SalesforceIncidentsTemplateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SalesforceIncidentsTemplateType fromValue(String value) {
    return new SalesforceIncidentsTemplateType(value);
  }
}
