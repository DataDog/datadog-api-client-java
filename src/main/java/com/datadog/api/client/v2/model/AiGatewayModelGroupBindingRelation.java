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

/** Access relation granted on a model group. */
@JsonSerialize(
    using = AiGatewayModelGroupBindingRelation.AiGatewayModelGroupBindingRelationSerializer.class)
public class AiGatewayModelGroupBindingRelation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("viewer", "runner", "editor"));

  public static final AiGatewayModelGroupBindingRelation VIEWER =
      new AiGatewayModelGroupBindingRelation("viewer");
  public static final AiGatewayModelGroupBindingRelation RUNNER =
      new AiGatewayModelGroupBindingRelation("runner");
  public static final AiGatewayModelGroupBindingRelation EDITOR =
      new AiGatewayModelGroupBindingRelation("editor");

  AiGatewayModelGroupBindingRelation(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelGroupBindingRelationSerializer
      extends StdSerializer<AiGatewayModelGroupBindingRelation> {
    public AiGatewayModelGroupBindingRelationSerializer(
        Class<AiGatewayModelGroupBindingRelation> t) {
      super(t);
    }

    public AiGatewayModelGroupBindingRelationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelGroupBindingRelation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelGroupBindingRelation fromValue(String value) {
    return new AiGatewayModelGroupBindingRelation(value);
  }
}
