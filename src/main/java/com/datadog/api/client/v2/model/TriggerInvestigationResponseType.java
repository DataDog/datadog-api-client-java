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

/** The resource type for trigger investigation responses. */
@JsonSerialize(
    using = TriggerInvestigationResponseType.TriggerInvestigationResponseTypeSerializer.class)
public class TriggerInvestigationResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("trigger_investigation_response"));

  public static final TriggerInvestigationResponseType TRIGGER_INVESTIGATION_RESPONSE =
      new TriggerInvestigationResponseType("trigger_investigation_response");

  TriggerInvestigationResponseType(String value) {
    super(value, allowedValues);
  }

  public static class TriggerInvestigationResponseTypeSerializer
      extends StdSerializer<TriggerInvestigationResponseType> {
    public TriggerInvestigationResponseTypeSerializer(Class<TriggerInvestigationResponseType> t) {
      super(t);
    }

    public TriggerInvestigationResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TriggerInvestigationResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TriggerInvestigationResponseType fromValue(String value) {
    return new TriggerInvestigationResponseType(value);
  }
}
