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

/** Type of the object. */
@JsonSerialize(using = IssueImpactType.IssueImpactTypeSerializer.class)
public class IssueImpactType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("error_tracking_issue_impact"));

  public static final IssueImpactType ERROR_TRACKING_ISSUE_IMPACT =
      new IssueImpactType("error_tracking_issue_impact");

  IssueImpactType(String value) {
    super(value, allowedValues);
  }

  public static class IssueImpactTypeSerializer extends StdSerializer<IssueImpactType> {
    public IssueImpactTypeSerializer(Class<IssueImpactType> t) {
      super(t);
    }

    public IssueImpactTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueImpactType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueImpactType fromValue(String value) {
    return new IssueImpactType(value);
  }
}
