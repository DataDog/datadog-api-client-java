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

/**
 * What happens to a client that no rule allows. <code>enforce</code> rejects the TLS handshake.
 * <code>audit</code> accepts the client and reports that it would have been rejected.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineClientIdentityMode.ObservabilityPipelineClientIdentityModeSerializer
            .class)
public class ObservabilityPipelineClientIdentityMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("enforce", "audit"));

  public static final ObservabilityPipelineClientIdentityMode ENFORCE =
      new ObservabilityPipelineClientIdentityMode("enforce");
  public static final ObservabilityPipelineClientIdentityMode AUDIT =
      new ObservabilityPipelineClientIdentityMode("audit");

  ObservabilityPipelineClientIdentityMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClientIdentityModeSerializer
      extends StdSerializer<ObservabilityPipelineClientIdentityMode> {
    public ObservabilityPipelineClientIdentityModeSerializer(
        Class<ObservabilityPipelineClientIdentityMode> t) {
      super(t);
    }

    public ObservabilityPipelineClientIdentityModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClientIdentityMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClientIdentityMode fromValue(String value) {
    return new ObservabilityPipelineClientIdentityMode(value);
  }
}
