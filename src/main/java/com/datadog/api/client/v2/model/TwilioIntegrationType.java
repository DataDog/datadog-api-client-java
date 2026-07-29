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

/** Integration discriminator for Twilio. */
@JsonSerialize(using = TwilioIntegrationType.TwilioIntegrationTypeSerializer.class)
public class TwilioIntegrationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("twilio"));

  public static final TwilioIntegrationType TWILIO = new TwilioIntegrationType("twilio");

  TwilioIntegrationType(String value) {
    super(value, allowedValues);
  }

  public static class TwilioIntegrationTypeSerializer extends StdSerializer<TwilioIntegrationType> {
    public TwilioIntegrationTypeSerializer(Class<TwilioIntegrationType> t) {
      super(t);
    }

    public TwilioIntegrationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TwilioIntegrationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TwilioIntegrationType fromValue(String value) {
    return new TwilioIntegrationType(value);
  }
}
