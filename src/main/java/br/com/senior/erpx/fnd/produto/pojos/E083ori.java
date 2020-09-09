/*
 * Produto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.9.4
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.produto.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.produto.pojos.E070emp;
import br.com.senior.erpx.fnd.produto.pojos.EnumTipPro;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E083ori
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-09T10:23:01.204Z")



public class E083ori {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("codOri")
  private String codOri = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("e070emp")
  private E070emp e070emp = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("desOri")
  private String desOri = null;

  @SerializedName("tipPro")
  private EnumTipPro tipPro = null;

  @SerializedName("usuger")
  private String usuger = null;

  public E083ori usualt(String usualt) {
    this.usualt = usualt;
    return this;
  }

   /**
   * 
   * @return usualt
  **/
  @ApiModelProperty(value = "")
  public String getUsualt() {
    return usualt;
  }

  public void setUsualt(String usualt) {
    this.usualt = usualt;
  }

  public E083ori excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluído
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluído")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E083ori codOri(String codOri) {
    this.codOri = codOri;
    return this;
  }

   /**
   * Código da origem do produto
   * @return codOri
  **/
  @ApiModelProperty(value = "Código da origem do produto")
  public String getCodOri() {
    return codOri;
  }

  public void setCodOri(String codOri) {
    this.codOri = codOri;
  }

  public E083ori dthger(OffsetDateTime dthger) {
    this.dthger = dthger;
    return this;
  }

   /**
   * 
   * @return dthger
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthger() {
    return dthger;
  }

  public void setDthger(OffsetDateTime dthger) {
    this.dthger = dthger;
  }

  public E083ori e070emp(E070emp e070emp) {
    this.e070emp = e070emp;
    return this;
  }

   /**
   * Get e070emp
   * @return e070emp
  **/
  @ApiModelProperty(value = "")
  public E070emp getE070emp() {
    return e070emp;
  }

  public void setE070emp(E070emp e070emp) {
    this.e070emp = e070emp;
  }

  public E083ori dthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
    return this;
  }

   /**
   * 
   * @return dthalt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthalt() {
    return dthalt;
  }

  public void setDthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
  }

  public E083ori id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public E083ori desOri(String desOri) {
    this.desOri = desOri;
    return this;
  }

   /**
   * Descrição da origem do produto
   * @return desOri
  **/
  @ApiModelProperty(value = "Descrição da origem do produto")
  public String getDesOri() {
    return desOri;
  }

  public void setDesOri(String desOri) {
    this.desOri = desOri;
  }

  public E083ori tipPro(EnumTipPro tipPro) {
    this.tipPro = tipPro;
    return this;
  }

   /**
   * Get tipPro
   * @return tipPro
  **/
  @ApiModelProperty(value = "")
  public EnumTipPro getTipPro() {
    return tipPro;
  }

  public void setTipPro(EnumTipPro tipPro) {
    this.tipPro = tipPro;
  }

  public E083ori usuger(String usuger) {
    this.usuger = usuger;
    return this;
  }

   /**
   * 
   * @return usuger
  **/
  @ApiModelProperty(value = "")
  public String getUsuger() {
    return usuger;
  }

  public void setUsuger(String usuger) {
    this.usuger = usuger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E083ori e083ori = (E083ori) o;
    return Objects.equals(this.usualt, e083ori.usualt) &&
        Objects.equals(this.excluido, e083ori.excluido) &&
        Objects.equals(this.codOri, e083ori.codOri) &&
        Objects.equals(this.dthger, e083ori.dthger) &&
        Objects.equals(this.e070emp, e083ori.e070emp) &&
        Objects.equals(this.dthalt, e083ori.dthalt) &&
        Objects.equals(this.id, e083ori.id) &&
        Objects.equals(this.desOri, e083ori.desOri) &&
        Objects.equals(this.tipPro, e083ori.tipPro) &&
        Objects.equals(this.usuger, e083ori.usuger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, excluido, codOri, dthger, e070emp, dthalt, id, desOri, tipPro, usuger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E083ori {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    codOri: ").append(toIndentedString(codOri)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    e070emp: ").append(toIndentedString(e070emp)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    desOri: ").append(toIndentedString(desOri)).append("\n");
    sb.append("    tipPro: ").append(toIndentedString(tipPro)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
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
