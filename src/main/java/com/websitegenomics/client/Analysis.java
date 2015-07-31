package com.websitegenomics.client;

import com.google.gson.Gson;
import java.util.HashMap;

/**
 *
 * @author WebGenomics Team
 */
public class Analysis {

    private String[] StrongestGenes;

    private HashMap<String, Double> FullGenome;

    private String[] Topics;

    private String url;

    private String LanguageCode;

    private String LanguageFullName;

    private boolean Pornography;

    private boolean OffensiveLanguage;

    public Analysis(String url, String[] genes, String[] topics, HashMap<String, Double> genome, String languageCode, String languageFullName, boolean porn, boolean offensiveLan) {
        this.StrongestGenes = genes;
        this.Topics = topics;
        this.FullGenome = genome;
        this.url = url;
        this.LanguageCode = languageCode;
        this.LanguageFullName = languageFullName;
        this.Pornography = porn;
        this.OffensiveLanguage = offensiveLan;
    }

    public String[] getStrongestGenes() {
        return StrongestGenes;
    }

    public void setStrongestGenes(String[] StrongestGenes) {
        this.StrongestGenes = StrongestGenes;
    }

    public HashMap<String, Double> getFullGenome() {
        return FullGenome;
    }

    public void setFullGenome(HashMap<String, Double> FullGenome) {
        this.FullGenome = FullGenome;
    }

    public String[] getTopics() {
        return Topics;
    }

    public void setTopics(String[] Topics) {
        this.Topics = Topics;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguageCode() {
        return LanguageCode;
    }

    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    public String getLanguageFullName() {
        return LanguageFullName;
    }

    public void setLanguageFullName(String LanguageFullName) {
        this.LanguageFullName = LanguageFullName;
    }

    public boolean isPornography() {
        return Pornography;
    }

    public void setPornography(boolean Pornography) {
        this.Pornography = Pornography;
    }

    public boolean isOffensiveLanguage() {
        return OffensiveLanguage;
    }

    public void setOffensiveLanguage(boolean OffensiveLanguage) {
        this.OffensiveLanguage = OffensiveLanguage;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
    
}
