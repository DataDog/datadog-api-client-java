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

/** Indicates that the resource is of type <code>steps</code>. */
@JsonSerialize(
    using =
        EscalationPolicyDataRelationshipsStepsDataItemsType
            .EscalationPolicyDataRelationshipsStepsDataItemsTypeSerializer.class)
public class EscalationPolicyDataRelationshipsStepsDataItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("steps"));

  public static final EscalationPolicyDataRelationshipsStepsDataItemsType STEPS =
      new EscalationPolicyDataRelationshipsStepsDataItemsType("steps");

  EscalationPolicyDataRelationshipsStepsDataItemsType(String value) {
    super(value, allowedValues);
  }

  public static class EscalationPolicyDataRelationshipsStepsDataItemsTypeSerializer
      extends StdSerializer<EscalationPolicyDataRelationshipsStepsDataItemsType> {
    public EscalationPolicyDataRelationshipsStepsDataItemsTypeSerializer(
        Class<EscalationPolicyDataRelationshipsStepsDataItemsType> t) {
      super(t);
    }

    public EscalationPolicyDataRelationshipsStepsDataItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EscalationPolicyDataRelationshipsStepsDataItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationPolicyDataRelationshipsStepsDataItemsType fromValue(String value) {
    return new EscalationPolicyDataRelationshipsStepsDataItemsType(value);
  }
}
