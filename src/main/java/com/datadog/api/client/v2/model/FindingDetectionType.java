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

/** The detection type of the finding. */
@JsonSerialize(using = FindingDetectionType.FindingDetectionTypeSerializer.class)
public class FindingDetectionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("misconfiguration", "attack_path", "identity_risk", "api_security"));

  public static final FindingDetectionType MISCONFIGURATION =
      new FindingDetectionType("misconfiguration");
  public static final FindingDetectionType ATTACK_PATH = new FindingDetectionType("attack_path");
  public static final FindingDetectionType IDENTITY_RISK =
      new FindingDetectionType("identity_risk");
  public static final FindingDetectionType API_SECURITY = new FindingDetectionType("api_security");

  FindingDetectionType(String value) {
    super(value, allowedValues);
  }

  public static class FindingDetectionTypeSerializer extends StdSerializer<FindingDetectionType> {
    public FindingDetectionTypeSerializer(Class<FindingDetectionType> t) {
      super(t);
    }

    public FindingDetectionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FindingDetectionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FindingDetectionType fromValue(String value) {
    return new FindingDetectionType(value);
  }
}
