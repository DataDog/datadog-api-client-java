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

/** The action to take when the session quota is reached. */
@JsonSerialize(
    using = RUMRetentionQuotaReachedAction.RUMRetentionQuotaReachedActionSerializer.class)
public class RUMRetentionQuotaReachedAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("stop", "slowdown"));

  public static final RUMRetentionQuotaReachedAction STOP =
      new RUMRetentionQuotaReachedAction("stop");
  public static final RUMRetentionQuotaReachedAction SLOWDOWN =
      new RUMRetentionQuotaReachedAction("slowdown");

  RUMRetentionQuotaReachedAction(String value) {
    super(value, allowedValues);
  }

  public static class RUMRetentionQuotaReachedActionSerializer
      extends StdSerializer<RUMRetentionQuotaReachedAction> {
    public RUMRetentionQuotaReachedActionSerializer(Class<RUMRetentionQuotaReachedAction> t) {
      super(t);
    }

    public RUMRetentionQuotaReachedActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRetentionQuotaReachedAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRetentionQuotaReachedAction fromValue(String value) {
    return new RUMRetentionQuotaReachedAction(value);
  }
}
