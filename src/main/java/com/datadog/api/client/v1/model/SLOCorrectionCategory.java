/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Category the SLO correction belongs to. */
@JsonSerialize(using = SLOCorrectionCategory.SLOCorrectionCategorySerializer.class)
public class SLOCorrectionCategory extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("Scheduled Maintenance", "Outside Business Hours", "Deployment", "Other"));

  public static final SLOCorrectionCategory SCHEDULED_MAINTENANCE =
      new SLOCorrectionCategory("Scheduled Maintenance");
  public static final SLOCorrectionCategory OUTSIDE_BUSINESS_HOURS =
      new SLOCorrectionCategory("Outside Business Hours");
  public static final SLOCorrectionCategory DEPLOYMENT = new SLOCorrectionCategory("Deployment");
  public static final SLOCorrectionCategory OTHER = new SLOCorrectionCategory("Other");

  SLOCorrectionCategory(String value) {
    super(value, allowedValues);
  }

  public static class SLOCorrectionCategorySerializer extends StdSerializer<SLOCorrectionCategory> {
    public SLOCorrectionCategorySerializer(Class<SLOCorrectionCategory> t) {
      super(t);
    }

    public SLOCorrectionCategorySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SLOCorrectionCategory value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SLOCorrectionCategory fromValue(String value) {
    return new SLOCorrectionCategory(value);
  }
}
