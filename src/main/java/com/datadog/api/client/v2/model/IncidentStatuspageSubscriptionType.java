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

/** Statuspage email subscription resource type. */
@JsonSerialize(
    using = IncidentStatuspageSubscriptionType.IncidentStatuspageSubscriptionTypeSerializer.class)
public class IncidentStatuspageSubscriptionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("statuspage_email_subscription"));

  public static final IncidentStatuspageSubscriptionType STATUSPAGE_EMAIL_SUBSCRIPTION =
      new IncidentStatuspageSubscriptionType("statuspage_email_subscription");

  IncidentStatuspageSubscriptionType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentStatuspageSubscriptionTypeSerializer
      extends StdSerializer<IncidentStatuspageSubscriptionType> {
    public IncidentStatuspageSubscriptionTypeSerializer(
        Class<IncidentStatuspageSubscriptionType> t) {
      super(t);
    }

    public IncidentStatuspageSubscriptionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentStatuspageSubscriptionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentStatuspageSubscriptionType fromValue(String value) {
    return new IncidentStatuspageSubscriptionType(value);
  }
}
