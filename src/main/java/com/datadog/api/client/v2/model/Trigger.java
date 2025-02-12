/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = Trigger.TriggerDeserializer.class)
@JsonSerialize(using = Trigger.TriggerSerializer.class)
public class Trigger extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(Trigger.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class TriggerSerializer extends StdSerializer<Trigger> {
    public TriggerSerializer(Class<Trigger> t) {
      super(t);
    }

    public TriggerSerializer() {
      this(null);
    }

    @Override
    public void serialize(Trigger value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class TriggerDeserializer extends StdDeserializer<Trigger> {
    public TriggerDeserializer() {
      this(Trigger.class);
    }

    public TriggerDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public Trigger deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize APITriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (APITriggerWrapper.class.equals(Integer.class)
            || APITriggerWrapper.class.equals(Long.class)
            || APITriggerWrapper.class.equals(Float.class)
            || APITriggerWrapper.class.equals(Double.class)
            || APITriggerWrapper.class.equals(Boolean.class)
            || APITriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((APITriggerWrapper.class.equals(Integer.class)
                        || APITriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((APITriggerWrapper.class.equals(Float.class)
                        || APITriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (APITriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (APITriggerWrapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(APITriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((APITriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'APITriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'APITriggerWrapper'", e);
      }

      // deserialize AppTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AppTriggerWrapper.class.equals(Integer.class)
            || AppTriggerWrapper.class.equals(Long.class)
            || AppTriggerWrapper.class.equals(Float.class)
            || AppTriggerWrapper.class.equals(Double.class)
            || AppTriggerWrapper.class.equals(Boolean.class)
            || AppTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AppTriggerWrapper.class.equals(Integer.class)
                        || AppTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AppTriggerWrapper.class.equals(Float.class)
                        || AppTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AppTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AppTriggerWrapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AppTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AppTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AppTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AppTriggerWrapper'", e);
      }

      // deserialize CaseTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CaseTriggerWrapper.class.equals(Integer.class)
            || CaseTriggerWrapper.class.equals(Long.class)
            || CaseTriggerWrapper.class.equals(Float.class)
            || CaseTriggerWrapper.class.equals(Double.class)
            || CaseTriggerWrapper.class.equals(Boolean.class)
            || CaseTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CaseTriggerWrapper.class.equals(Integer.class)
                        || CaseTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CaseTriggerWrapper.class.equals(Float.class)
                        || CaseTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CaseTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CaseTriggerWrapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CaseTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CaseTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CaseTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CaseTriggerWrapper'", e);
      }

      // deserialize ChangeEventTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ChangeEventTriggerWrapper.class.equals(Integer.class)
            || ChangeEventTriggerWrapper.class.equals(Long.class)
            || ChangeEventTriggerWrapper.class.equals(Float.class)
            || ChangeEventTriggerWrapper.class.equals(Double.class)
            || ChangeEventTriggerWrapper.class.equals(Boolean.class)
            || ChangeEventTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ChangeEventTriggerWrapper.class.equals(Integer.class)
                        || ChangeEventTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ChangeEventTriggerWrapper.class.equals(Float.class)
                        || ChangeEventTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ChangeEventTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ChangeEventTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ChangeEventTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ChangeEventTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ChangeEventTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ChangeEventTriggerWrapper'", e);
      }

      // deserialize DashboardTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DashboardTriggerWrapper.class.equals(Integer.class)
            || DashboardTriggerWrapper.class.equals(Long.class)
            || DashboardTriggerWrapper.class.equals(Float.class)
            || DashboardTriggerWrapper.class.equals(Double.class)
            || DashboardTriggerWrapper.class.equals(Boolean.class)
            || DashboardTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DashboardTriggerWrapper.class.equals(Integer.class)
                        || DashboardTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DashboardTriggerWrapper.class.equals(Float.class)
                        || DashboardTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DashboardTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DashboardTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DashboardTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DashboardTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DashboardTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DashboardTriggerWrapper'", e);
      }

      // deserialize GithubWebhookTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (GithubWebhookTriggerWrapper.class.equals(Integer.class)
            || GithubWebhookTriggerWrapper.class.equals(Long.class)
            || GithubWebhookTriggerWrapper.class.equals(Float.class)
            || GithubWebhookTriggerWrapper.class.equals(Double.class)
            || GithubWebhookTriggerWrapper.class.equals(Boolean.class)
            || GithubWebhookTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((GithubWebhookTriggerWrapper.class.equals(Integer.class)
                        || GithubWebhookTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((GithubWebhookTriggerWrapper.class.equals(Float.class)
                        || GithubWebhookTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (GithubWebhookTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (GithubWebhookTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(GithubWebhookTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((GithubWebhookTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'GithubWebhookTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'GithubWebhookTriggerWrapper'", e);
      }

      // deserialize IncidentTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentTriggerWrapper.class.equals(Integer.class)
            || IncidentTriggerWrapper.class.equals(Long.class)
            || IncidentTriggerWrapper.class.equals(Float.class)
            || IncidentTriggerWrapper.class.equals(Double.class)
            || IncidentTriggerWrapper.class.equals(Boolean.class)
            || IncidentTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentTriggerWrapper.class.equals(Integer.class)
                        || IncidentTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentTriggerWrapper.class.equals(Float.class)
                        || IncidentTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IncidentTriggerWrapper'", e);
      }

      // deserialize MonitorTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (MonitorTriggerWrapper.class.equals(Integer.class)
            || MonitorTriggerWrapper.class.equals(Long.class)
            || MonitorTriggerWrapper.class.equals(Float.class)
            || MonitorTriggerWrapper.class.equals(Double.class)
            || MonitorTriggerWrapper.class.equals(Boolean.class)
            || MonitorTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((MonitorTriggerWrapper.class.equals(Integer.class)
                        || MonitorTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((MonitorTriggerWrapper.class.equals(Float.class)
                        || MonitorTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (MonitorTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (MonitorTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(MonitorTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((MonitorTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'MonitorTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'MonitorTriggerWrapper'", e);
      }

      // deserialize ScheduleTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ScheduleTriggerWrapper.class.equals(Integer.class)
            || ScheduleTriggerWrapper.class.equals(Long.class)
            || ScheduleTriggerWrapper.class.equals(Float.class)
            || ScheduleTriggerWrapper.class.equals(Double.class)
            || ScheduleTriggerWrapper.class.equals(Boolean.class)
            || ScheduleTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ScheduleTriggerWrapper.class.equals(Integer.class)
                        || ScheduleTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ScheduleTriggerWrapper.class.equals(Float.class)
                        || ScheduleTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ScheduleTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ScheduleTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ScheduleTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ScheduleTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ScheduleTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ScheduleTriggerWrapper'", e);
      }

      // deserialize SecurityTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityTriggerWrapper.class.equals(Integer.class)
            || SecurityTriggerWrapper.class.equals(Long.class)
            || SecurityTriggerWrapper.class.equals(Float.class)
            || SecurityTriggerWrapper.class.equals(Double.class)
            || SecurityTriggerWrapper.class.equals(Boolean.class)
            || SecurityTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityTriggerWrapper.class.equals(Integer.class)
                        || SecurityTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityTriggerWrapper.class.equals(Float.class)
                        || SecurityTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SecurityTriggerWrapper'", e);
      }

      // deserialize SlackTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SlackTriggerWrapper.class.equals(Integer.class)
            || SlackTriggerWrapper.class.equals(Long.class)
            || SlackTriggerWrapper.class.equals(Float.class)
            || SlackTriggerWrapper.class.equals(Double.class)
            || SlackTriggerWrapper.class.equals(Boolean.class)
            || SlackTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SlackTriggerWrapper.class.equals(Integer.class)
                        || SlackTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SlackTriggerWrapper.class.equals(Float.class)
                        || SlackTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SlackTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SlackTriggerWrapper.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SlackTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SlackTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SlackTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SlackTriggerWrapper'", e);
      }

      // deserialize WorkflowTriggerWrapper
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WorkflowTriggerWrapper.class.equals(Integer.class)
            || WorkflowTriggerWrapper.class.equals(Long.class)
            || WorkflowTriggerWrapper.class.equals(Float.class)
            || WorkflowTriggerWrapper.class.equals(Double.class)
            || WorkflowTriggerWrapper.class.equals(Boolean.class)
            || WorkflowTriggerWrapper.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WorkflowTriggerWrapper.class.equals(Integer.class)
                        || WorkflowTriggerWrapper.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WorkflowTriggerWrapper.class.equals(Float.class)
                        || WorkflowTriggerWrapper.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WorkflowTriggerWrapper.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WorkflowTriggerWrapper.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WorkflowTriggerWrapper.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WorkflowTriggerWrapper) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WorkflowTriggerWrapper'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WorkflowTriggerWrapper'", e);
      }

      Trigger ret = new Trigger();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public Trigger getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "Trigger cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public Trigger() {
    super("oneOf", Boolean.FALSE);
  }

  public Trigger(APITriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(AppTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(CaseTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(ChangeEventTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(DashboardTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(GithubWebhookTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(IncidentTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(MonitorTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(ScheduleTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(SecurityTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(SlackTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public Trigger(WorkflowTriggerWrapper o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("APITriggerWrapper", new GenericType<APITriggerWrapper>() {});
    schemas.put("AppTriggerWrapper", new GenericType<AppTriggerWrapper>() {});
    schemas.put("CaseTriggerWrapper", new GenericType<CaseTriggerWrapper>() {});
    schemas.put("ChangeEventTriggerWrapper", new GenericType<ChangeEventTriggerWrapper>() {});
    schemas.put("DashboardTriggerWrapper", new GenericType<DashboardTriggerWrapper>() {});
    schemas.put("GithubWebhookTriggerWrapper", new GenericType<GithubWebhookTriggerWrapper>() {});
    schemas.put("IncidentTriggerWrapper", new GenericType<IncidentTriggerWrapper>() {});
    schemas.put("MonitorTriggerWrapper", new GenericType<MonitorTriggerWrapper>() {});
    schemas.put("ScheduleTriggerWrapper", new GenericType<ScheduleTriggerWrapper>() {});
    schemas.put("SecurityTriggerWrapper", new GenericType<SecurityTriggerWrapper>() {});
    schemas.put("SlackTriggerWrapper", new GenericType<SlackTriggerWrapper>() {});
    schemas.put("WorkflowTriggerWrapper", new GenericType<WorkflowTriggerWrapper>() {});
    JSON.registerDescendants(Trigger.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return Trigger.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: APITriggerWrapper, AppTriggerWrapper, CaseTriggerWrapper,
   * ChangeEventTriggerWrapper, DashboardTriggerWrapper, GithubWebhookTriggerWrapper,
   * IncidentTriggerWrapper, MonitorTriggerWrapper, ScheduleTriggerWrapper, SecurityTriggerWrapper,
   * SlackTriggerWrapper, WorkflowTriggerWrapper
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(APITriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AppTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CaseTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ChangeEventTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DashboardTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(GithubWebhookTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IncidentTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(MonitorTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ScheduleTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SecurityTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SlackTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WorkflowTriggerWrapper.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be APITriggerWrapper, AppTriggerWrapper, CaseTriggerWrapper,"
            + " ChangeEventTriggerWrapper, DashboardTriggerWrapper, GithubWebhookTriggerWrapper,"
            + " IncidentTriggerWrapper, MonitorTriggerWrapper, ScheduleTriggerWrapper,"
            + " SecurityTriggerWrapper, SlackTriggerWrapper, WorkflowTriggerWrapper");
  }

  /**
   * Get the actual instance, which can be the following: APITriggerWrapper, AppTriggerWrapper,
   * CaseTriggerWrapper, ChangeEventTriggerWrapper, DashboardTriggerWrapper,
   * GithubWebhookTriggerWrapper, IncidentTriggerWrapper, MonitorTriggerWrapper,
   * ScheduleTriggerWrapper, SecurityTriggerWrapper, SlackTriggerWrapper, WorkflowTriggerWrapper
   *
   * @return The actual instance (APITriggerWrapper, AppTriggerWrapper, CaseTriggerWrapper,
   *     ChangeEventTriggerWrapper, DashboardTriggerWrapper, GithubWebhookTriggerWrapper,
   *     IncidentTriggerWrapper, MonitorTriggerWrapper, ScheduleTriggerWrapper,
   *     SecurityTriggerWrapper, SlackTriggerWrapper, WorkflowTriggerWrapper)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `APITriggerWrapper`. If the actual instance is not
   * `APITriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `APITriggerWrapper`
   * @throws ClassCastException if the instance is not `APITriggerWrapper`
   */
  public APITriggerWrapper getAPITriggerWrapper() throws ClassCastException {
    return (APITriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AppTriggerWrapper`. If the actual instance is not
   * `AppTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AppTriggerWrapper`
   * @throws ClassCastException if the instance is not `AppTriggerWrapper`
   */
  public AppTriggerWrapper getAppTriggerWrapper() throws ClassCastException {
    return (AppTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CaseTriggerWrapper`. If the actual instance is not
   * `CaseTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CaseTriggerWrapper`
   * @throws ClassCastException if the instance is not `CaseTriggerWrapper`
   */
  public CaseTriggerWrapper getCaseTriggerWrapper() throws ClassCastException {
    return (CaseTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ChangeEventTriggerWrapper`. If the actual instance is not
   * `ChangeEventTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ChangeEventTriggerWrapper`
   * @throws ClassCastException if the instance is not `ChangeEventTriggerWrapper`
   */
  public ChangeEventTriggerWrapper getChangeEventTriggerWrapper() throws ClassCastException {
    return (ChangeEventTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DashboardTriggerWrapper`. If the actual instance is not
   * `DashboardTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DashboardTriggerWrapper`
   * @throws ClassCastException if the instance is not `DashboardTriggerWrapper`
   */
  public DashboardTriggerWrapper getDashboardTriggerWrapper() throws ClassCastException {
    return (DashboardTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GithubWebhookTriggerWrapper`. If the actual instance is not
   * `GithubWebhookTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GithubWebhookTriggerWrapper`
   * @throws ClassCastException if the instance is not `GithubWebhookTriggerWrapper`
   */
  public GithubWebhookTriggerWrapper getGithubWebhookTriggerWrapper() throws ClassCastException {
    return (GithubWebhookTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentTriggerWrapper`. If the actual instance is not
   * `IncidentTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentTriggerWrapper`
   * @throws ClassCastException if the instance is not `IncidentTriggerWrapper`
   */
  public IncidentTriggerWrapper getIncidentTriggerWrapper() throws ClassCastException {
    return (IncidentTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `MonitorTriggerWrapper`. If the actual instance is not
   * `MonitorTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `MonitorTriggerWrapper`
   * @throws ClassCastException if the instance is not `MonitorTriggerWrapper`
   */
  public MonitorTriggerWrapper getMonitorTriggerWrapper() throws ClassCastException {
    return (MonitorTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ScheduleTriggerWrapper`. If the actual instance is not
   * `ScheduleTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ScheduleTriggerWrapper`
   * @throws ClassCastException if the instance is not `ScheduleTriggerWrapper`
   */
  public ScheduleTriggerWrapper getScheduleTriggerWrapper() throws ClassCastException {
    return (ScheduleTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityTriggerWrapper`. If the actual instance is not
   * `SecurityTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityTriggerWrapper`
   * @throws ClassCastException if the instance is not `SecurityTriggerWrapper`
   */
  public SecurityTriggerWrapper getSecurityTriggerWrapper() throws ClassCastException {
    return (SecurityTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SlackTriggerWrapper`. If the actual instance is not
   * `SlackTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SlackTriggerWrapper`
   * @throws ClassCastException if the instance is not `SlackTriggerWrapper`
   */
  public SlackTriggerWrapper getSlackTriggerWrapper() throws ClassCastException {
    return (SlackTriggerWrapper) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WorkflowTriggerWrapper`. If the actual instance is not
   * `WorkflowTriggerWrapper`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WorkflowTriggerWrapper`
   * @throws ClassCastException if the instance is not `WorkflowTriggerWrapper`
   */
  public WorkflowTriggerWrapper getWorkflowTriggerWrapper() throws ClassCastException {
    return (WorkflowTriggerWrapper) super.getActualInstance();
  }
}
