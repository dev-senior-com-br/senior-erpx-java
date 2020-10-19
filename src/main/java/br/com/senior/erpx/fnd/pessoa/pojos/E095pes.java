/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 * OpenAPI spec version: 1.12.1
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.pessoa.pojos.E001pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E021mot;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumIndFor;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumSitReg;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumTipEmc;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * E095pes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T21:05:01.247Z")



public class E095pes {
  @SerializedName("codMot")
  private E021mot codMot = null;

  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("indFor")
  private EnumIndFor indFor = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("marFor")
  private String marFor = null;

  @SerializedName("e001pes")
  private E001pes e001pes = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("usuMot")
  private String usuMot = null;

  @SerializedName("tipEmc")
  private EnumTipEmc tipEmc = null;

  @SerializedName("arrAbn")
  private Boolean arrAbn = null;

  @SerializedName("dthMot")
  private LocalDate dthMot = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("sitFor")
  private EnumSitReg sitFor = null;

  @SerializedName("endNet")
  private String endNet = null;

  @SerializedName("obsMot")
  private String obsMot = null;

  @SerializedName("id")
  private UUID id = null;

  public E095pes codMot(E021mot codMot) {
    this.codMot = codMot;
    return this;
  }

   /**
   * Get codMot
   * @return codMot
  **/
  @ApiModelProperty(value = "")
  public E021mot getCodMot() {
    return codMot;
  }

  public void setCodMot(E021mot codMot) {
    this.codMot = codMot;
  }

  public E095pes usualt(String usualt) {
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

  public E095pes excluido(Boolean excluido) {
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

  public E095pes indFor(EnumIndFor indFor) {
    this.indFor = indFor;
    return this;
  }

   /**
   * Get indFor
   * @return indFor
  **/
  @ApiModelProperty(value = "")
  public EnumIndFor getIndFor() {
    return indFor;
  }

  public void setIndFor(EnumIndFor indFor) {
    this.indFor = indFor;
  }

  public E095pes dthger(OffsetDateTime dthger) {
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

  public E095pes marFor(String marFor) {
    this.marFor = marFor;
    return this;
  }

   /**
   * Marca
   * @return marFor
  **/
  @ApiModelProperty(value = "Marca")
  public String getMarFor() {
    return marFor;
  }

  public void setMarFor(String marFor) {
    this.marFor = marFor;
  }

  public E095pes e001pes(E001pes e001pes) {
    this.e001pes = e001pes;
    return this;
  }

   /**
   * Get e001pes
   * @return e001pes
  **/
  @ApiModelProperty(value = "")
  public E001pes getE001pes() {
    return e001pes;
  }

  public void setE001pes(E001pes e001pes) {
    this.e001pes = e001pes;
  }

  public E095pes dthalt(OffsetDateTime dthalt) {
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

  public E095pes usuMot(String usuMot) {
    this.usuMot = usuMot;
    return this;
  }

   /**
   * Usuário responsável pelo motivo da situação do fornecedor
   * @return usuMot
  **/
  @ApiModelProperty(value = "Usuário responsável pelo motivo da situação do fornecedor")
  public String getUsuMot() {
    return usuMot;
  }

  public void setUsuMot(String usuMot) {
    this.usuMot = usuMot;
  }

  public E095pes tipEmc(EnumTipEmc tipEmc) {
    this.tipEmc = tipEmc;
    return this;
  }

   /**
   * Get tipEmc
   * @return tipEmc
  **/
  @ApiModelProperty(value = "")
  public EnumTipEmc getTipEmc() {
    return tipEmc;
  }

  public void setTipEmc(EnumTipEmc tipEmc) {
    this.tipEmc = tipEmc;
  }

  public E095pes arrAbn(Boolean arrAbn) {
    this.arrAbn = arrAbn;
    return this;
  }

   /**
   * Utilizar a regra de arredondamento da ABNT
   * @return arrAbn
  **/
  @ApiModelProperty(value = "Utilizar a regra de arredondamento da ABNT")
  public Boolean isArrAbn() {
    return arrAbn;
  }

  public void setArrAbn(Boolean arrAbn) {
    this.arrAbn = arrAbn;
  }

  public E095pes dthMot(LocalDate dthMot) {
    this.dthMot = dthMot;
    return this;
  }

   /**
   * Data do motivo da situação do fornecedor
   * @return dthMot
  **/
  @ApiModelProperty(value = "Data do motivo da situação do fornecedor")
  public LocalDate getDthMot() {
    return dthMot;
  }

  public void setDthMot(LocalDate dthMot) {
    this.dthMot = dthMot;
  }

  public E095pes usuger(String usuger) {
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

  public E095pes sitFor(EnumSitReg sitFor) {
    this.sitFor = sitFor;
    return this;
  }

   /**
   * Get sitFor
   * @return sitFor
  **/
  @ApiModelProperty(value = "")
  public EnumSitReg getSitFor() {
    return sitFor;
  }

  public void setSitFor(EnumSitReg sitFor) {
    this.sitFor = sitFor;
  }

  public E095pes endNet(String endNet) {
    this.endNet = endNet;
    return this;
  }

   /**
   * Site
   * @return endNet
  **/
  @ApiModelProperty(value = "Site")
  public String getEndNet() {
    return endNet;
  }

  public void setEndNet(String endNet) {
    this.endNet = endNet;
  }

  public E095pes obsMot(String obsMot) {
    this.obsMot = obsMot;
    return this;
  }

   /**
   * Observação do motivo da situação do fornecedor
   * @return obsMot
  **/
  @ApiModelProperty(value = "Observação do motivo da situação do fornecedor")
  public String getObsMot() {
    return obsMot;
  }

  public void setObsMot(String obsMot) {
    this.obsMot = obsMot;
  }

  public E095pes id(UUID id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E095pes e095pes = (E095pes) o;
    return Objects.equals(this.codMot, e095pes.codMot) &&
        Objects.equals(this.usualt, e095pes.usualt) &&
        Objects.equals(this.excluido, e095pes.excluido) &&
        Objects.equals(this.indFor, e095pes.indFor) &&
        Objects.equals(this.dthger, e095pes.dthger) &&
        Objects.equals(this.marFor, e095pes.marFor) &&
        Objects.equals(this.e001pes, e095pes.e001pes) &&
        Objects.equals(this.dthalt, e095pes.dthalt) &&
        Objects.equals(this.usuMot, e095pes.usuMot) &&
        Objects.equals(this.tipEmc, e095pes.tipEmc) &&
        Objects.equals(this.arrAbn, e095pes.arrAbn) &&
        Objects.equals(this.dthMot, e095pes.dthMot) &&
        Objects.equals(this.usuger, e095pes.usuger) &&
        Objects.equals(this.sitFor, e095pes.sitFor) &&
        Objects.equals(this.endNet, e095pes.endNet) &&
        Objects.equals(this.obsMot, e095pes.obsMot) &&
        Objects.equals(this.id, e095pes.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codMot, usualt, excluido, indFor, dthger, marFor, e001pes, dthalt, usuMot, tipEmc, arrAbn, dthMot, usuger, sitFor, endNet, obsMot, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E095pes {\n");
    
    sb.append("    codMot: ").append(toIndentedString(codMot)).append("\n");
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    indFor: ").append(toIndentedString(indFor)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    marFor: ").append(toIndentedString(marFor)).append("\n");
    sb.append("    e001pes: ").append(toIndentedString(e001pes)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    usuMot: ").append(toIndentedString(usuMot)).append("\n");
    sb.append("    tipEmc: ").append(toIndentedString(tipEmc)).append("\n");
    sb.append("    arrAbn: ").append(toIndentedString(arrAbn)).append("\n");
    sb.append("    dthMot: ").append(toIndentedString(dthMot)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    sitFor: ").append(toIndentedString(sitFor)).append("\n");
    sb.append("    endNet: ").append(toIndentedString(endNet)).append("\n");
    sb.append("    obsMot: ").append(toIndentedString(obsMot)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

