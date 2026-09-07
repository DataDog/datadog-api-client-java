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

/** AI postmortem response resource type. */
@JsonSerialize(
    using = IncidentAIPostmortemResponseType.IncidentAIPostmortemResponseTypeSerializer.class)
public class IncidentAIPostmortemResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("get_incident_ai_postmortem_response"));

  public static final IncidentAIPostmortemResponseType GET_INCIDENT_AI_POSTMORTEM_RESPONSE =
      new IncidentAIPostmortemResponseType("get_incident_ai_postmortem_response");

  IncidentAIPostmortemResponseType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentAIPostmortemResponseTypeSerializer
      extends StdSerializer<IncidentAIPostmortemResponseType> {
    public IncidentAIPostmortemResponseTypeSerializer(Class<IncidentAIPostmortemResponseType> t) {
      super(t);
    }

    public IncidentAIPostmortemResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentAIPostmortemResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentAIPostmortemResponseType fromValue(String value) {
    return new IncidentAIPostmortemResponseType(value);
  }
}
