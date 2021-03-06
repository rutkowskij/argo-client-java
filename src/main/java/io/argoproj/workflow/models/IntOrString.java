/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * +protobuf&#x3D;true +protobuf.options.(gogoproto.goproto_stringer)&#x3D;false +k8s:openapi-gen&#x3D;true
 */
@ApiModel(description = "+protobuf=true +protobuf.options.(gogoproto.goproto_stringer)=false +k8s:openapi-gen=true")

public class IntOrString {
  public static final String SERIALIZED_NAME_INT_VAL = "intVal";
  @SerializedName(SERIALIZED_NAME_INT_VAL)
  private Integer intVal;

  public static final String SERIALIZED_NAME_STR_VAL = "strVal";
  @SerializedName(SERIALIZED_NAME_STR_VAL)
  private String strVal;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public IntOrString intVal(Integer intVal) {
    
    this.intVal = intVal;
    return this;
  }

   /**
   * Get intVal
   * @return intVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntVal() {
    return intVal;
  }


  public void setIntVal(Integer intVal) {
    this.intVal = intVal;
  }


  public IntOrString strVal(String strVal) {
    
    this.strVal = strVal;
    return this;
  }

   /**
   * Get strVal
   * @return strVal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStrVal() {
    return strVal;
  }


  public void setStrVal(String strVal) {
    this.strVal = strVal;
  }


  public IntOrString type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntOrString intOrString = (IntOrString) o;
    return Objects.equals(this.intVal, intOrString.intVal) &&
        Objects.equals(this.strVal, intOrString.strVal) &&
        Objects.equals(this.type, intOrString.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intVal, strVal, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntOrString {\n");
    sb.append("    intVal: ").append(toIndentedString(intVal)).append("\n");
    sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

