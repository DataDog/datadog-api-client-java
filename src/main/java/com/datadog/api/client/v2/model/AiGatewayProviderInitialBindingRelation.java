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

/** Provider access relation. Editor also grants View. */
@JsonSerialize(
    using =
        AiGatewayProviderInitialBindingRelation.AiGatewayProviderInitialBindingRelationSerializer
            .class)
public class AiGatewayProviderInitialBindingRelation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("viewer", "editor"));

  public static final AiGatewayProviderInitialBindingRelation VIEWER =
      new AiGatewayProviderInitialBindingRelation("viewer");
  public static final AiGatewayProviderInitialBindingRelation EDITOR =
      new AiGatewayProviderInitialBindingRelation("editor");

  AiGatewayProviderInitialBindingRelation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayProviderInitialBindingRelationSerializer
      extends StdSerializer<AiGatewayProviderInitialBindingRelation> {
    public AiGatewayProviderInitialBindingRelationSerializer(
        Class<AiGatewayProviderInitialBindingRelation> t) {
      super(t);
    }

    public AiGatewayProviderInitialBindingRelationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayProviderInitialBindingRelation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayProviderInitialBindingRelation fromValue(String value) {
    return new AiGatewayProviderInitialBindingRelation(value);
  }
}
