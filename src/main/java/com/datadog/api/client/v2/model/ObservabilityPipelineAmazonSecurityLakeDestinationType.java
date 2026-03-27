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

/** The destination type. Always <code>amazon_security_lake</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAmazonSecurityLakeDestinationType
            .ObservabilityPipelineAmazonSecurityLakeDestinationTypeSerializer.class)
public class ObservabilityPipelineAmazonSecurityLakeDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("amazon_security_lake"));

  public static final ObservabilityPipelineAmazonSecurityLakeDestinationType AMAZON_SECURITY_LAKE =
      new ObservabilityPipelineAmazonSecurityLakeDestinationType("amazon_security_lake");

  ObservabilityPipelineAmazonSecurityLakeDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAmazonSecurityLakeDestinationTypeSerializer
      extends StdSerializer<ObservabilityPipelineAmazonSecurityLakeDestinationType> {
    public ObservabilityPipelineAmazonSecurityLakeDestinationTypeSerializer(
        Class<ObservabilityPipelineAmazonSecurityLakeDestinationType> t) {
      super(t);
    }

    public ObservabilityPipelineAmazonSecurityLakeDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAmazonSecurityLakeDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAmazonSecurityLakeDestinationType fromValue(String value) {
    return new ObservabilityPipelineAmazonSecurityLakeDestinationType(value);
  }
}
