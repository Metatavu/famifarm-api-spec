package fi.metatavu.famifarm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.famifarm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BatchPhase
 */
public enum BatchPhase {
  SOWING("SOWING"),
    PLANTING("PLANTING"),
    TABLE_SPREAD("TABLE_SPREAD"),
    HARVEST("HARVEST"),
    COMPLETE("COMPLETE");

  private String value;

  BatchPhase(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BatchPhase fromValue(String text) {
    for (BatchPhase b : BatchPhase.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
