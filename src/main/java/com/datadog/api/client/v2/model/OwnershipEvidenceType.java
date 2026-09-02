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
 * The type of the ownership evidence resource. The value should always be <code>ownership_evidence
 * </code>.
 */
@JsonSerialize(using = OwnershipEvidenceType.OwnershipEvidenceTypeSerializer.class)
public class OwnershipEvidenceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ownership_evidence"));

  public static final OwnershipEvidenceType OWNERSHIP_EVIDENCE =
      new OwnershipEvidenceType("ownership_evidence");

  OwnershipEvidenceType(String value) {
    super(value, allowedValues);
  }

  public static class OwnershipEvidenceTypeSerializer extends StdSerializer<OwnershipEvidenceType> {
    public OwnershipEvidenceTypeSerializer(Class<OwnershipEvidenceType> t) {
      super(t);
    }

    public OwnershipEvidenceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OwnershipEvidenceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OwnershipEvidenceType fromValue(String value) {
    return new OwnershipEvidenceType(value);
  }
}
