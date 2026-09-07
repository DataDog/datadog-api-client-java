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

/** Override the default action to take when the WAF custom rule would block. */
@JsonSerialize(
    using =
        ApplicationSecurityWafCustomRuleActionAction
            .ApplicationSecurityWafCustomRuleActionActionSerializer.class)
public class ApplicationSecurityWafCustomRuleActionAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("redirect_request", "block_request"));

  public static final ApplicationSecurityWafCustomRuleActionAction REDIRECT_REQUEST =
      new ApplicationSecurityWafCustomRuleActionAction("redirect_request");
  public static final ApplicationSecurityWafCustomRuleActionAction BLOCK_REQUEST =
      new ApplicationSecurityWafCustomRuleActionAction("block_request");

  ApplicationSecurityWafCustomRuleActionAction(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafCustomRuleActionActionSerializer
      extends StdSerializer<ApplicationSecurityWafCustomRuleActionAction> {
    public ApplicationSecurityWafCustomRuleActionActionSerializer(
        Class<ApplicationSecurityWafCustomRuleActionAction> t) {
      super(t);
    }

    public ApplicationSecurityWafCustomRuleActionActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafCustomRuleActionAction value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafCustomRuleActionAction fromValue(String value) {
    return new ApplicationSecurityWafCustomRuleActionAction(value);
  }
}
