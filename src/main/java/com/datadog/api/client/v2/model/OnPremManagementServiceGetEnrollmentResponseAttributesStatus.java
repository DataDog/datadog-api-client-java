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

/** The status of the enrollment. */
@JsonSerialize(
    using =
        OnPremManagementServiceGetEnrollmentResponseAttributesStatus
            .OnPremManagementServiceGetEnrollmentResponseAttributesStatusSerializer.class)
public class OnPremManagementServiceGetEnrollmentResponseAttributesStatus
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("new", "success", "failed"));

  public static final OnPremManagementServiceGetEnrollmentResponseAttributesStatus NEW =
      new OnPremManagementServiceGetEnrollmentResponseAttributesStatus("new");
  public static final OnPremManagementServiceGetEnrollmentResponseAttributesStatus SUCCESS =
      new OnPremManagementServiceGetEnrollmentResponseAttributesStatus("success");
  public static final OnPremManagementServiceGetEnrollmentResponseAttributesStatus FAILED =
      new OnPremManagementServiceGetEnrollmentResponseAttributesStatus("failed");

  OnPremManagementServiceGetEnrollmentResponseAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class OnPremManagementServiceGetEnrollmentResponseAttributesStatusSerializer
      extends StdSerializer<OnPremManagementServiceGetEnrollmentResponseAttributesStatus> {
    public OnPremManagementServiceGetEnrollmentResponseAttributesStatusSerializer(
        Class<OnPremManagementServiceGetEnrollmentResponseAttributesStatus> t) {
      super(t);
    }

    public OnPremManagementServiceGetEnrollmentResponseAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnPremManagementServiceGetEnrollmentResponseAttributesStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnPremManagementServiceGetEnrollmentResponseAttributesStatus fromValue(
      String value) {
    return new OnPremManagementServiceGetEnrollmentResponseAttributesStatus(value);
  }
}
