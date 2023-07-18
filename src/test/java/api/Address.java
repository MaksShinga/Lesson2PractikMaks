package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = Address.class)
public class Address {
    @JsonProperty("Ref")
    public String Ref;
    @JsonProperty("SettlementType")
    public String SettlementType;
    @JsonProperty("Latitude")
    public String Latitude;
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Description")
    public String Description;
    @JsonProperty("DescriptionRu")
    public String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    public String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    public String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    public String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    public String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    public String Region;
    @JsonProperty("RegionsDescription")
    public String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    public String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    public String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    public String Area;
    @JsonProperty("AreaDescription")
    public String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    public String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    public String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    public String Index1;
    @JsonProperty("Index2")
    public String Index2;
    @JsonProperty("IndexCOATSU1")
    public String IndexCOATSU1;
    @JsonProperty("Delivery1")
    public String Delivery1;
    @JsonProperty("Delivery2")
    public String Delivery2;
    @JsonProperty("Delivery3")
    public String Delivery3;
    @JsonProperty("Delivery4")
    public String Delivery4;
    @JsonProperty("Delivery5")
    public String Delivery5;
    @JsonProperty("Delivery6")
    public String Delivery6;
    @JsonProperty("Delivery7")
    public String Delivery7;
    @JsonProperty("SpecialCashCheck")
    public int SpecialCashCheck;
    @JsonProperty("Warehouse")
    public String Warehouse;

    @JsonCreator
    public Address(@JsonProperty("Ref") String ref,@JsonProperty("SettlementType") String settlementType,@JsonProperty("Latitude") String latitude,@JsonProperty("Longitude") String longitude,@JsonProperty("Description") String description,@JsonProperty("DescriptionRu") String descriptionRu,@JsonProperty("DescriptionTranslit") String descriptionTranslit,@JsonProperty("SettlementTypeDescription") String settlementTypeDescription,@JsonProperty("SettlementTypeDescriptionRu") String settlementTypeDescriptionRu,@JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionTranslit,@JsonProperty("Region") String region,@JsonProperty("RegionsDescription") String regionsDescription,@JsonProperty("RegionsDescriptionRu") String regionsDescriptionRu,@JsonProperty("RegionsDescriptionTranslit") String regionsDescriptionTranslit,@JsonProperty("Area") String area,@JsonProperty("AreaDescription") String areaDescription,@JsonProperty("AreaDescriptionRu") String areaDescriptionRu,@JsonProperty("AreaDescriptionTranslit") String areaDescriptionTranslit,@JsonProperty("Index1") String index1,@JsonProperty("Index2") String index2,@JsonProperty("IndexCOATSU1") String indexCOATSU1,@JsonProperty("Delivery1") String delivery1,@JsonProperty("Delivery2") String delivery2,@JsonProperty("Delivery3") String delivery3,@JsonProperty("Delivery4") String delivery4,@JsonProperty("Delivery5") String delivery5,@JsonProperty("Delivery6") String delivery6,@JsonProperty("Delivery7") String delivery7,@JsonProperty("SpecialCashCheck") int specialCashCheck,@JsonProperty("Warehouse") String warehouse) {
        this.Ref = ref;
        this.SettlementType = settlementType;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Description = description;
        this.DescriptionRu = descriptionRu;
        this.DescriptionTranslit = descriptionTranslit;
        this.SettlementTypeDescription = settlementTypeDescription;
        this.SettlementTypeDescriptionRu = settlementTypeDescriptionRu;
        this.SettlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
        this.Region = region;
        this.RegionsDescription = regionsDescription;
        this.RegionsDescriptionRu = regionsDescriptionRu;
        this.RegionsDescriptionTranslit = regionsDescriptionTranslit;
        this.Area = area;
        this.AreaDescription = areaDescription;
        this.AreaDescriptionRu = areaDescriptionRu;
        this.AreaDescriptionTranslit = areaDescriptionTranslit;
        this.Index1 = index1;
        this.Index2 = index2;
        this.IndexCOATSU1 = indexCOATSU1;
        this.Delivery1 = delivery1;
        this.Delivery2 = delivery2;
        this.Delivery3 = delivery3;
        this.Delivery4 = delivery4;
        this.Delivery5 = delivery5;
        this.Delivery6 = delivery6;
        this.Delivery7 = delivery7;
        this.SpecialCashCheck = specialCashCheck;
        this.Warehouse = warehouse;
    }
    @Getter
    public String getRef() {
        return Ref;
    }
    @Setter
public void setRef(String ref) {
        Ref = ref;
    }
    @Getter
    public String getSettlementType() {
        return SettlementType;
    }
    @Setter
    public void setSettlementType(String settlementType) {
        SettlementType = settlementType;
    }
    @Getter
    public String getLatitude() {
        return Latitude;
    }
    @Setter
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }
    @Getter
    public String getLongitude() {
        return Longitude;
    }
    @Setter
    public void setLongitude(String longitude) {
        Longitude = longitude;
    }
    @Getter
    public String getDescription() {
        return Description;
    }
    @Setter
    public void setDescription(String description) {
        Description = description;
    }
    @Getter
    public String getDescriptionRu() {
        return DescriptionRu;
    }
    @Setter
    public void setDescriptionRu(String descriptionRu) {
        DescriptionRu = descriptionRu;
    }
    @Getter
    public String getDescriptionTranslit() {
        return DescriptionTranslit;
    }
    @Setter
    public void setDescriptionTranslit(String descriptionTranslit) {
        DescriptionTranslit = descriptionTranslit;
    }
    @Getter
    public String getSettlementTypeDescription() {
        return SettlementTypeDescription;
    }
    @Setter
    public void setSettlementTypeDescription(String settlementTypeDescription) {
        SettlementTypeDescription = settlementTypeDescription;
    }
    @Getter
    public String getSettlementTypeDescriptionRu() {
        return SettlementTypeDescriptionRu;
    }
    @Setter
    public void setSettlementTypeDescriptionRu(String settlementTypeDescriptionRu) {
        SettlementTypeDescriptionRu = settlementTypeDescriptionRu;
    }
    @Getter
    public String getSettlementTypeDescriptionTranslit() {
        return SettlementTypeDescriptionTranslit;
    }
    @Setter
    public void setSettlementTypeDescriptionTranslit(String settlementTypeDescriptionTranslit) {
        SettlementTypeDescriptionTranslit = settlementTypeDescriptionTranslit;
    }
    @Getter
    public String getRegion() {
        return Region;
    }
    @Setter
    public void setRegion(String region) {
        Region = region;
    }
    @Getter
    public String getRegionsDescription() {
        return RegionsDescription;
    }
    @Setter
    public void setRegionsDescription(String regionsDescription) {
        RegionsDescription = regionsDescription;
    }
    @Getter
    public String getRegionsDescriptionRu() {
        return RegionsDescriptionRu;
    }
    @Setter
    public void setRegionsDescriptionRu(String regionsDescriptionRu) {
        RegionsDescriptionRu = regionsDescriptionRu;
    }
    @Getter
    public String getRegionsDescriptionTranslit() {
        return RegionsDescriptionTranslit;
    }
    @Setter
    public void setRegionsDescriptionTranslit(String regionsDescriptionTranslit) {
        RegionsDescriptionTranslit = regionsDescriptionTranslit;
    }
    @Getter
    public String getArea() {
        return Area;
    }
    @Setter
    public void setArea(String area) {
        Area = area;
    }
    @Getter
    public String getAreaDescription() {
        return AreaDescription;
    }
    @Setter
    public void setAreaDescription(String areaDescription) {
        AreaDescription = areaDescription;
    }
    @Getter
    public String getAreaDescriptionRu() {
        return AreaDescriptionRu;
    }
    @Setter
    public void setAreaDescriptionRu(String areaDescriptionRu) {
        AreaDescriptionRu = areaDescriptionRu;
    }
    @Getter
    public String getAreaDescriptionTranslit() {
        return AreaDescriptionTranslit;
    }
    @Setter
    public void setAreaDescriptionTranslit(String areaDescriptionTranslit) {
        AreaDescriptionTranslit = areaDescriptionTranslit;
    }
    @Getter
    public String getIndex1() {
        return Index1;
    }
    @Setter
    public void setIndex1(String index1) {
        Index1 = index1;
    }
    @Getter
    public String getIndex2() {
        return Index2;
    }
    @Setter
    public void setIndex2(String index2) {
        Index2 = index2;
    }
    @Getter
    public String getIndexCOATSU1() {
        return IndexCOATSU1;
    }
    @Setter
    public void setIndexCOATSU1(String indexCOATSU1) {
        IndexCOATSU1 = indexCOATSU1;
    }
    @Getter
    public String getDelivery1() {
        return Delivery1;
    }
    @Setter
    public void setDelivery1(String delivery1) {
        Delivery1 = delivery1;
    }
    @Getter
    public String getDelivery2() {
        return Delivery2;
    }
    @Setter
    public void setDelivery2(String delivery2) {
        Delivery2 = delivery2;
    }
    @Getter
    public String getDelivery3() {
        return Delivery3;
    }
    @Setter
    public void setDelivery3(String delivery3) {
        Delivery3 = delivery3;
    }
    @Getter
    public String getDelivery4() {
        return Delivery4;
    }
    @Setter
    public void setDelivery4(String delivery4) {
        Delivery4 = delivery4;
    }
    @Getter
    public String getDelivery5() {
        return Delivery5;
    }
    @Setter
    public void setDelivery5(String delivery5) {
        Delivery5 = delivery5;
    }
    @Getter
    public String getDelivery6() {
        return Delivery6;
    }
    @Setter
    public void setDelivery6(String delivery6) {
        Delivery6 = delivery6;
    }
    @Getter
    public String getDelivery7() {
        return Delivery7;
    }
    @Setter
    public void setDelivery7(String delivery7) {
        Delivery7 = delivery7;
    }
    @Getter
    public int getSpecialCashCheck() {
        return SpecialCashCheck;
    }
    @Setter
    public void setSpecialCashCheck(int specialCashCheck) {
        SpecialCashCheck = specialCashCheck;
    }
    @Getter
    public String getWarehouse() {
        return Warehouse;
    }
    @Setter
    public void setWarehouse(String warehouse) {
        Warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Ref='" + Ref + '\'' +
                ", SettlementType='" + SettlementType + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Description='" + Description + '\'' +
                ", DescriptionRu='" + DescriptionRu + '\'' +
                ", DescriptionTranslit='" + DescriptionTranslit + '\'' +
                ", SettlementTypeDescription='" + SettlementTypeDescription + '\'' +
                ", SettlementTypeDescriptionRu='" + SettlementTypeDescriptionRu + '\'' +
                ", SettlementTypeDescriptionTranslit='" + SettlementTypeDescriptionTranslit + '\'' +
                ", Region='" + Region + '\'' +
                ", RegionsDescription='" + RegionsDescription + '\'' +
                ", RegionsDescriptionRu='" + RegionsDescriptionRu + '\'' +
                ", RegionsDescriptionTranslit='" + RegionsDescriptionTranslit + '\'' +
                ", Area='" + Area + '\'' +
                ", AreaDescription='" + AreaDescription + '\'' +
                ", AreaDescriptionRu='" + AreaDescriptionRu + '\'' +
                ", AreaDescriptionTranslit='" + AreaDescriptionTranslit + '\'' +
                ", Index1='" + Index1 + '\'' +
                ", Index2='" + Index2 + '\'' +
                ", IndexCOATSU1='" + IndexCOATSU1 + '\'' +
                ", Delivery1='" + Delivery1 + '\'' +
                ", Delivery2='" + Delivery2 + '\'' +
                ", Delivery3='" + Delivery3 + '\'' +
                ", Delivery4='" + Delivery4 + '\'' +
                ", Delivery5='" + Delivery5 + '\'' +
                ", Delivery6='" + Delivery6 + '\'' +
                ", Delivery7='" + Delivery7 + '\'' +
                ", SpecialCashCheck=" + SpecialCashCheck +
                ", Warehouse='" + Warehouse + '\'' +
                '}';
    }
}



