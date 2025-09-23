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

/** The destination type. The value should always be <code>google_pubsub</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineGooglePubSubDestinationType
            .ObservabilityPipelineGooglePubSubDestinationTypeSerializer.class)
public class ObservabilityPipelineGooglePubSubDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google_pubsub"));

  public static final ObservabilityPipelineGooglePubSubDestinationType GOOGLE_PUBSUB =
      new ObservabilityPipelineGooglePubSubDestinationType("google_pubsub");

  ObservabilityPipelineGooglePubSubDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineGooglePubSubDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineGooglePubSubDestinationType> {
    public ObservabilityPipelineGooglePubSubDestinationTypeSerializer(
        Class<ObservabilityPipelineGooglePubSubDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineGooglePubSubDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineGooglePubSubDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineGooglePubSubDestinationType fromValue(String value) {
    return new ObservabilityPipelineGooglePubSubDestinationType(value);
  }
}
