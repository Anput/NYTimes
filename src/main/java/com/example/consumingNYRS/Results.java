package com.example.consumingNYRS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private final String section;
    private final String subsection;
    private final String title;
    private final String astract;
    private final String url1;
    private final String url2;
    private final String byline;
    private final String item_type;
    private final String updated_date;
    private final String created_date;
    private final String published_date;
    private final String material_type_facet;
    private final String kicker;
    private final ArrayList<String> des_facet = new ArrayList<>();
    private final ArrayList<String> org_facet = new ArrayList<>();
    private final ArrayList<String> per_facet = new ArrayList<>();
    private final ArrayList<String> geo_facet = new ArrayList<>();
    private final ArrayList<Multimedia> multimedia;
    private final String short_url;

    public Results(String section, String subsection, String title, String astract, String url1, String url2, String byline, String item_type, String updated_date, String created_date, String published_date, String material_type_facet, String kicker, ArrayList<Multimedia> multimedia, String short_url) {
        this.section = section;
        this.subsection = subsection;
        this.title = title;
        this.astract = astract;
        this.url1 = url1;
        this.url2 = url2;
        this.byline = byline;
        this.item_type = item_type;
        this.updated_date = updated_date;
        this.created_date = created_date;
        this.published_date = published_date;
        this.material_type_facet = material_type_facet;
        this.kicker = kicker;
        this.multimedia = multimedia;
        this.short_url = short_url;
    }

    public String getSection() {
        return section;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getTitle() {
        return title;
    }

    public String getAstract() {
        return astract;
    }

    public String getUrl1() {
        return url1;
    }

    public String getUrl2() {
        return url2;
    }

    public String getByline() {
        return byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public ArrayList<Multimedia> getMultimedia() {
        return multimedia;
    }

    public String getShort_url() {
        return short_url;
    }

    @Override
    public String toString() {
        return "Results{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", astract='" + astract + '\'' +
                ", url1='" + url1 + '\'' +
                ", url2='" + url2 + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + des_facet +
                ", org_facet=" + org_facet +
                ", per_facet=" + per_facet +
                ", geo_facet=" + geo_facet +
                ", multimedia=" + multimedia +
                ", short_url='" + short_url + '\'' +
                '}';
    }
}

